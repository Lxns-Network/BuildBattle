/*
 *
 * BuildBattle - Ultimate building competition minigame
 * Copyright (C) 2022 Plugily Projects - maintained by Tigerpanzer_02 and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package plugily.projects.buildbattle.handlers.themes;

import java.util.List;

public class BBTheme {
    private static final char CHINESE_WORD_BEGIN = 0x4e00;
    private static final char CHINESE_WORD_END = 0x9fa5;
    private static final char ASCII_BEGIN_1 = 'A';
    private static final char ASCII_END_1 = 'Z';
    private static final char ASCII_BEGIN_2 = 'a';
    private static final char ASCII_END_2 = 'z';
    private static final char ASCII_BEGIN_3 = '0';
    private static final char ASCII_END_3 = '9';

    private final List<String> theme;
    private final Difficulty difficulty;

    public BBTheme(List<String> theme, Difficulty difficulty) {
        this.theme = theme.stream().map(BBTheme::stripWord).toList();
        this.difficulty = difficulty;
    }

    public String getTheme() {
        return theme.get(0);
    }

    public boolean isRight(String answer) {
        answer = stripWord(answer);
        return theme.stream().anyMatch(answer::contains);
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    private static String stripWord(String word) {
        var chars = word.toLowerCase().toCharArray();
        var sb = new StringBuilder();
        for (char a : chars) {
            if (a <= CHINESE_WORD_END && a >= CHINESE_WORD_BEGIN
                    || a >= ASCII_BEGIN_1 && a <= ASCII_END_1
                    || a >= ASCII_BEGIN_2 && a <= ASCII_END_2
                    || a >= ASCII_BEGIN_3 && a <= ASCII_END_3) {
                sb.append(a);
            }
        }
        return sb.toString();
    }

    public enum Difficulty {
        EASY(1), MEDIUM(2), HARD(3);

        private final int pointsReward;

        Difficulty(int pointsReward) {
            this.pointsReward = pointsReward;
        }

        public int getPointsReward() {
            return pointsReward;
        }
    }

}
