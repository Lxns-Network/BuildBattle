package plugily.projects.buildbattle.api.event.guess;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import plugily.projects.buildbattle.arena.GuessArena;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

public class PlayerGuessRightEvent extends Event {
    private static final HandlerList HANDLERS = new HandlerList();
    private final Player player;
    private final Collection<Player> builders;
    private final int guesserPosition;
    private final GuessArena arena;

    public PlayerGuessRightEvent(Player player, Collection<Player> builders, int guesserPosition, GuessArena arena) {
        super(true);
        this.player = player;
        this.builders = builders;
        this.guesserPosition = guesserPosition;
        this.arena = arena;
    }

    public GuessArena getArena() {
        return arena;
    }

    public Player getPlayer() {
        return player;
    }

    public int getGuesserPosition() {
        return guesserPosition;
    }

    public Collection<Player> getBuilders() {
        return builders;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return null;
    }
}
