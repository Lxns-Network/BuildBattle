package plugily.projects.buildbattle.api.event.guess;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import plugily.projects.buildbattle.arena.GuessArena;

import java.util.Collection;

public class GuessRoundEndEvent extends Event {
    private static final HandlerList HANDLERS = new HandlerList();
    private final GuessArena arena;
    private final boolean allGuessed;

    public GuessRoundEndEvent(GuessArena arena, boolean allGuessed) {
        this.arena = arena;
        this.allGuessed = allGuessed;
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
        return null;
    }

}
