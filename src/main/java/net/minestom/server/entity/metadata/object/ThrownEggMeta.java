package net.minestom.server.entity.metadata.object;

import net.minestom.server.entity.Entity;
import net.minestom.server.item.Material;
import org.jetbrains.annotations.NotNull;

public class ThrownEggMeta extends ObjectEntityMeta {

    public ThrownEggMeta(@NotNull Entity entity) {
        super(entity, Material.EGG);
    }

}
