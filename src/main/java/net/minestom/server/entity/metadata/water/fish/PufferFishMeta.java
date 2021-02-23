package net.minestom.server.entity.metadata.water.fish;

import net.minestom.server.entity.Entity;
import net.minestom.server.entity.Metadata;
import org.jetbrains.annotations.NotNull;

public class PufferFishMeta extends AbstractFishMeta {

    public PufferFishMeta(@NotNull Entity entity) {
        super(entity);
    }

    public State getState() {
        return State.VALUES[getMetadata().getIndex((byte) 16, 0)];
    }

    public void setState(State state) {
        getMetadata().setIndex((byte) 16, Metadata.VarInt(state.ordinal()));
        updateBoundingBox(state);
    }

    private void updateBoundingBox(State state) {
        switch (state) {
            case UNPUFFED:
                setBoundingBox(.35D, .35D);
                break;
            case SEMI_PUFFED:
                setBoundingBox(.5D, .5D);
                break;
            default:
                setBoundingBox(.7D, .7D);
                break;
        }
    }

    public enum State {
        UNPUFFED,
        SEMI_PUFFED,
        FULLY_PUFFED;

        private final static State[] VALUES = values();
    }

}
