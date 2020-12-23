package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityAxolotl;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.Axolotl;
import org.bukkit.entity.EntityType;

public class CraftAxolotl extends CraftAnimals implements Axolotl {

    public CraftAxolotl(CraftServer server, EntityAxolotl entity) {
        super(server, entity);
    }

    @Override
    public EntityAxolotl getHandle() {
        return (EntityAxolotl) super.getHandle();
    }

    @Override
    public String toString() {
        return "CraftAxolotl";
    }

    @Override
    public EntityType getType() {
        return EntityType.AXOLOTL;
    }
}
