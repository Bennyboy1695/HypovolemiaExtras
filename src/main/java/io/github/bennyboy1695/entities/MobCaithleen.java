package io.github.bennyboy1695.entities;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityZombie;

import net.minecraft.world.World;


public class MobCaithleen extends EntityZombie{

    public MobCaithleen(World par1World)
    {
        super(par1World);
    }
    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5D);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(100);
        this.isImmuneToFire = true;
        this.setCustomNameTag("Caithleen");
        this.getAlwaysRenderNameTag();

    }
    @Override
    protected String getDeathSound()
    {
        return "hypovolemiaextras:mob.death";
    }
    @Override
    protected float getSoundVolume()
    {
        return 0.6F;
    }
}
