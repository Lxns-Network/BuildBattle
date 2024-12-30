package plugily.projects.buildbattle.api.event.guess;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import plugily.projects.buildbattle.arena.GuessArena;

import java.util.Collection;
import java.util.List;

public class GuessRoundEndEvent extends Event {
    private static final HandlerList HANDLERS = new HandlerList();
    private final GuessArena arena;
    private final List<Player> currentBuilders;
    private final List<Player> playersLeft;
    private final List<Player> guessed;
    private final boolean allGuessed;

    public GuessRoundEndEvent(GuessArena arena, List<Player> currentBuilders, List<Player> playersLeft, List<Player> guessed, boolean allGuessed) {
        this.arena = arena;
        this.currentBuilders = currentBuilders;
        this.playersLeft = playersLeft;
        this.guessed = guessed;
        this.allGuessed = allGuessed;
    }

    public List<Player> getCurrentBuilders() {
        return currentBuilders;
    }

    public List<Player> getPlayersLeft() {
        return playersLeft;
    }

    public List<Player> getGuessed() {
        return guessed;
    }

    public boolean isAllGuessed() {
        return allGuessed;
    }

    public GuessArena getArena() {
        return arena;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLERS;
    }

}
