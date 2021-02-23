package net.minestom.server.entity.metadata;

import net.minestom.server.collision.BoundingBox;
import net.minestom.server.entity.Entity;
import net.minestom.server.entity.Metadata;
import org.jetbrains.annotations.NotNull;

public class AgeableMobMeta extends PathfinderMobMeta {

    protected AgeableMobMeta(@NotNull Entity entity) {
        super(entity);
    }

    public boolean isBaby() {
        return getMetadata().getIndex((byte) 15, false);
    }

    public void setBaby(boolean value) {
        if (isBaby() == value) {
            return;
        }
        BoundingBox bb = this.entity.getBoundingBox();
        if (value) {
            setBoundingBox(bb.getWidth() / 2, bb.getHeight() / 2);
        } else {
            setBoundingBox(bb.getWidth() * 2, bb.getHeight() * 2);
        }
        getMetadata().getIndex((byte) 15, Metadata.Boolean(value));
    }

}
