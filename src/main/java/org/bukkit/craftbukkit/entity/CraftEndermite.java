package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityEndermite;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.Endermite;
import org.bukkit.entity.EntityType;

public class CraftEndermite extends CraftMonster implements Endermite {

    public CraftEndermite(CraftServer server, EntityEndermite entity) {
        super(server, entity);
    }

    @Override
    public EntityEndermite getHandle() {
        return (EntityEndermite) super.getHandle();
    }

    @Override
    public String toString() {
        return "CraftEndermite";
    }

    @Override
    public EntityType getType() {
        return EntityType.ENDERMITE;
    }

    @Override
    public boolean isPlayerSpawned() {
        throw new UnsupportedOperationException("Not supported. Unless you can fix it, this is not a bug :)");
    }

    @Override
    public void setPlayerSpawned(boolean playerSpawned) {
        throw new UnsupportedOperationException("Not supported. Unless you can fix it, this is not a bug :)");
    }
}
