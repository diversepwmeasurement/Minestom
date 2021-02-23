package net.minestom.server.entity.metadata.other;

import net.minestom.server.entity.Entity;
import net.minestom.server.entity.Metadata;
import net.minestom.server.entity.metadata.EntityMeta;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FishingHookMeta extends EntityMeta {

    private Entity hooked;

    public FishingHookMeta(@NotNull Entity entity) {
        super(entity);
    }

    @Nullable
    public Entity getHookedEntity() {
        return this.hooked;
    }

    public void setHookedEntity(@Nullable Entity value) {
        this.hooked = value;
        int entityID = value == null ? 0 : value.getEntityId() + 1;
        getMetadata().setIndex((byte) 7, Metadata.VarInt(entityID));
    }

    public boolean isCatchable() {
        return getMetadata().getIndex((byte) 8, false);
    }

    public void setCatchable(boolean value) {
        getMetadata().setIndex((byte) 8, Metadata.Boolean(value));
    }

}
