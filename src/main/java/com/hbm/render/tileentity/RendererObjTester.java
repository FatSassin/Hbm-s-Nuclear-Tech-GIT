package com.hbm.render.tileentity;

import org.lwjgl.opengl.GL11;

import com.hbm.lib.RefStrings;
import com.hbm.main.ResourceManager;
import com.hbm.render.util.RenderMiscEffects;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

public class RendererObjTester extends TileEntitySpecialRenderer {
	
	private static final ResourceLocation objTesterModelRL = new ResourceLocation(/*"/assets/" + */RefStrings.MODID, "models/TestObj.obj");
	//private static final ResourceLocation objTesterModelRL = new ResourceLocation(/*"/assets/" + */RefStrings.MODID, "models/Prototype.obj");
	private IModelCustom objTesterModel;
    private ResourceLocation objTesterTexture;
	
	public RendererObjTester()
    {
		objTesterModel = AdvancedModelLoader.loadModel(objTesterModelRL);
		objTesterTexture = new ResourceLocation(RefStrings.MODID, "textures/models/TestObj.png");
		//objTesterTexture = new ResourceLocation(RefStrings.MODID, "textures/models/Prototype.png");
    }

    @Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f)
    {
        GL11.glPushMatrix();
        GL11.glTranslated(x + 0.5, y, z + 0.5);
        GL11.glEnable(GL11.GL_LIGHTING);
		/*switch(tileEntity.getBlockMetadata())
		{
		case 5:
			GL11.glRotatef(90, 0F, 1F, 0F); break;
		case 3:
			GL11.glRotatef(180, 0F, 1F, 0F); break;
		case 4:
			GL11.glRotatef(270, 0F, 1F, 0F); break;
		case 2:
			GL11.glRotatef(0, 0F, 1F, 0F); break;
		}*/

        /*bindTexture(objTesterTexture);
        objTesterModel.renderAll();*/
        
		//GL11.glScaled(5, 5, 5);
		
        /*GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glEnable(GL11.GL_CULL_FACE);
		bindTexture(ResourceManager.sat_foeq_burning_tex);
		ResourceManager.sat_foeq_burning.renderAll();
		
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		GL11.glDisable(GL11.GL_CULL_FACE);
		GL11.glEnable(GL11.GL_BLEND);
		
		Random rand = new Random(System.currentTimeMillis() / 50);

        GL11.glScaled(1.15, 0.75, 1.15);
        GL11.glTranslated(0, -0.5, 0.3);
        GL11.glDisable(GL11.GL_CULL_FACE);
		for(int i = 0; i < 10; i++) {
			GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE);
			GL11.glColor3d(1, 0.75, 0.25);
	        GL11.glRotatef(rand.nextInt(360), 0F, 1F, 0F);
			ResourceManager.sat_foeq_fire.renderAll();
	        GL11.glTranslated(0, 2, 0);
			GL11.glColor3d(1, 0.5, 0);
	        GL11.glRotatef(rand.nextInt(360), 0F, 1F, 0F);
			ResourceManager.sat_foeq_fire.renderAll();
	        GL11.glTranslated(0, 2, 0);
			GL11.glColor3d(1, 0.25, 0);
	        GL11.glRotatef(rand.nextInt(360), 0F, 1F, 0F);
			ResourceManager.sat_foeq_fire.renderAll();
	        GL11.glTranslated(0, 2, 0);
			GL11.glColor3d(1, 0.0, 0);
	        GL11.glRotatef(rand.nextInt(360), 0F, 1F, 0F);
			ResourceManager.sat_foeq_fire.renderAll();
			
	        GL11.glTranslated(0, -3.8, 0);
	        
	        GL11.glScaled(0.95, 1.2, 0.95);
		}
		
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glEnable(GL11.GL_TEXTURE_2D);*/

        /*ModelCalBarrel barrel = new ModelCalBarrel();
        ModelCalStock stock = new ModelCalStock();
        ModelCalDualStock saddle = new ModelCalDualStock();

        bindTexture(new ResourceLocation(RefStrings.MODID, "textures/models/ModelCalDualStock.png"));
        saddle.renderAll(1F/16F);
        
        bindTexture(new ResourceLocation(RefStrings.MODID, "textures/models/ModelCalBarrel.png"));
        GL11.glTranslated(0, 0, -0.25);
        barrel.renderAll(1F/16F);
        GL11.glTranslated(0, 0, 0.5);
        barrel.renderAll(1F/16F);
        
        bindTexture(new ResourceLocation(RefStrings.MODID, "textures/models/ModelCalStock.png"));*/
        //stock.renderAll(1F/16F);
        
        //SoyuzPronter.prontSoyuz(2);
        //TomPronter.prontTom();
        //BeamPronter.prontBeam(Vec3.createVectorHelper(5, 5, 5), EnumWaveType.SPIRAL, EnumBeamType.SOLID, 0xff8000, 0xff8000, (int)tileEntity.getWorldObj().getTotalWorldTime() % 360 * 25, 25, 0.1F, 4, 0.05F);
        //BeamPronter.prontBeam(Vec3.createVectorHelper(5, 5, 5), EnumWaveType.SPIRAL, EnumBeamType.SOLID, 0xffff00, 0xffff00, (int)tileEntity.getWorldObj().getTotalWorldTime() % 360 * 25, 1, 0F, 4, 0.05F);
        //BeamPronter.prontHelix(Vec3.createVectorHelper(0, 5, 0), 0.5, 0.5, 0.5, EnumWaveType.SPIRAL, EnumBeamType.LINE, 0x0000ff, 0xffff00, (int)tileEntity.getWorldObj().getTotalWorldTime() % 360 * 25 + 180, 25, 0.25F);

        //DiamondPronter.pront(1, 2, 3, EnumSymbol.OXIDIZER);

        //GL11.glTranslatef(0.0F, -0.25F, 0.0F);
        //GL11.glRotatef(-25, 0, 1, 0);
        //GL11.glRotatef(15, 0, 0, 1);
        
        /*long time = tileEntity.getWorldObj().getTotalWorldTime();
        double sine = Math.sin(time * 0.05) * 5;
        double sin3 = Math.sin(time * 0.05 + Math.PI * 0.5) * 5;
        double sin2 = Math.sin(time * 0.05 + Math.PI);
        int height = 7;
        GL11.glTranslated(0.0F, height + sin2, 0.0F);
        GL11.glRotated(sine, 0, 0, 1);
        GL11.glRotated(sin3, 1, 0, 0);
        GL11.glTranslated(0.0F, -height, 0.0F);
        
        GL11.glEnable(GL11.GL_CULL_FACE);
        GL11.glShadeModel(GL11.GL_SMOOTH);
        bindTexture(ResourceManager.soyuz_lander_tex);
        ResourceManager.soyuz_lander.renderPart("Capsule");
        bindTexture(ResourceManager.soyuz_chute_tex);
        ResourceManager.soyuz_lander.renderPart("Chute");
        GL11.glShadeModel(GL11.GL_FLAT);*/

        /*GL11.glRotatef(-90, 0, 1, 0);
        GL11.glTranslated(0, 3, 0);
        bindTexture(ResourceManager.nikonium_tex);
        ResourceManager.nikonium.renderAll();
        GL11.glTranslated(0, -3, 0);
        GL11.glRotatef(90, 0, 1, 0);

        GL11.glShadeModel(GL11.GL_SMOOTH);
        bindTexture(ResourceManager.fstbmb_tex);
        ResourceManager.fstbmb.renderPart("Body");
        ResourceManager.fstbmb.renderPart("Balefire");
        
        bindTexture(new ResourceLocation(RefStrings.MODID + ":textures/misc/glintBF.png"));
        RenderMiscEffects.renderClassicGlint(tileEntity.getWorldObj(), f, ResourceManager.fstbmb, "Balefire", 0.0F, 0.8F, 0.15F, 5, 2F);
        
        FontRenderer font = Minecraft.getMinecraft().fontRenderer;
        float f3 = 0.04F;
        GL11.glTranslatef(0.815F, 0.9275F, 0.5F);
        GL11.glScalef(f3, -f3, f3);
        GL11.glNormal3f(0.0F, 0.0F, -1.0F * f3);
        GL11.glRotatef(90, 0, 1, 0);
        GL11.glDepthMask(false);
        GL11.glTranslatef(0, 1, 0);
        font.drawString("00:15", 0, 0, 0xff0000);
        GL11.glDepthMask(true);
        
        GL11.glShadeModel(GL11.GL_FLAT);*/

        GL11.glShadeModel(GL11.GL_SMOOTH);

        GL11.glEnable(GL11.GL_CULL_FACE);
        GL11.glEnable(GL11.GL_LIGHTING);

        bindTexture(ResourceManager.soyuz_module_dome_tex);
        ResourceManager.soyuz_module.renderPart("Dome");
        bindTexture(ResourceManager.soyuz_module_lander_tex);
        ResourceManager.soyuz_module.renderPart("Capsule");
        bindTexture(ResourceManager.soyuz_module_propulsion_tex);
        ResourceManager.soyuz_module.renderPart("Propulsion");
        bindTexture(ResourceManager.soyuz_module_solar_tex);
        ResourceManager.soyuz_module.renderPart("Solar");
        
        GL11.glShadeModel(GL11.GL_FLAT);
        
        GL11.glPopMatrix();
    }

}