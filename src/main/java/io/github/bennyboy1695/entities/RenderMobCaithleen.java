package io.github.bennyboy1695.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderMobCaithleen extends RenderLiving {
    private static final ResourceLocation Caithleen = new ResourceLocation("hypovolemiaextras:textures/entity/CaithleenMob.png");

    public RenderMobCaithleen(ModelBase par1ModelBase, float par2) {
        super(par1ModelBase, par2);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity par1Entity) {
        return Caithleen;
    }
}

