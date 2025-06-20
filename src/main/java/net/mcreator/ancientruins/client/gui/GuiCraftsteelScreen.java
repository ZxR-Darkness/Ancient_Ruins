package net.mcreator.ancientruins.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.ancientruins.world.inventory.GuiCraftsteelMenu;
import net.mcreator.ancientruins.network.GuiCraftsteelButtonMessage;
import net.mcreator.ancientruins.AncientRuinsMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class GuiCraftsteelScreen extends AbstractContainerScreen<GuiCraftsteelMenu> {
	private final static HashMap<String, Object> guistate = GuiCraftsteelMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_craft;

	public GuiCraftsteelScreen(GuiCraftsteelMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("ancient_ruins:textures/screens/gui_craftsteel.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.ancient_ruins.gui_craftsteel.label_empty"), 37, 37, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.ancient_ruins.gui_craftsteel.label_steel_crafter"), 4, 4, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		button_craft = new Button(this.leftPos + 60, this.topPos + 57, 51, 20, Component.translatable("gui.ancient_ruins.gui_craftsteel.button_craft"), e -> {
			if (true) {
				AncientRuinsMod.PACKET_HANDLER.sendToServer(new GuiCraftsteelButtonMessage(0, x, y, z));
				GuiCraftsteelButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_craft", button_craft);
		this.addRenderableWidget(button_craft);
	}
}
