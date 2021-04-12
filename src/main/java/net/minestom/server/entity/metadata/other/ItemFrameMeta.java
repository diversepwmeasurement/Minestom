package net.minestom.server.entity.metadata.other;

import net.minestom.server.entity.Entity;
import net.minestom.server.entity.Metadata;
import net.minestom.server.entity.metadata.EntityMeta;
import net.minestom.server.entity.metadata.ObjectDataProvider;
import net.minestom.server.item.ItemStack;
import net.minestom.server.utils.Rotation;
import org.jetbrains.annotations.NotNull;

public class ItemFrameMeta extends EntityMeta implements ObjectDataProvider {

    private Orientation orientation;

    public ItemFrameMeta(@NotNull Entity entity, @NotNull Metadata metadata) {
        super(entity, metadata);
        this.orientation = Orientation.DOWN;
    }

    @NotNull
    public ItemStack getItem() {
        return super.metadata.getIndex((byte) 7, ItemStack.AIR);
    }

    public void setItem(@NotNull ItemStack value) {
        super.metadata.setIndex((byte) 7, Metadata.Slot(value));
    }

    @NotNull
    public Rotation getRotation() {
        return Rotation.values()[super.metadata.getIndex((byte) 8, 0)];
    }

    public void setRotation(@NotNull Rotation value) {
        super.metadata.setIndex((byte) 8, Metadata.VarInt(value.ordinal()));
    }

    @NotNull
    public Orientation getOrientation() {
        return this.orientation;
    }

    /**
     * Sets orientation of the item frame.
     * This is possible only before spawn packet is sent.
     *
     * @param orientation the orientation of the item frame.
     */
    public void setOrientation(@NotNull Orientation orientation) {
        this.orientation = orientation;
    }

    @Override
    public int getObjectData() {
        return this.orientation.ordinal();
    }

    @Override
    public boolean requiresVelocityPacketAtSpawn() {
        return false;
    }

    public enum Orientation {
        DOWN,
        UP,
        NORTH,
        SOUTH,
        WEST,
        EAST
    }

}
