package com.fastjim.stardustindustrymetaladdon.client;

import com.fastjim.stardustindustrymetaladdon.StardustIndustryMetalAddon;
import com.fastjim.stardustindustrymetaladdon.block.MetalBlock;
import net.minecraft.client.particle.ParticleEngine;
import net.minecraft.client.particle.TerrainParticle;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientTickEvent;

import java.lang.reflect.Field;

@EventBusSubscriber(modid = StardustIndustryMetalAddon.MODID, value = Dist.CLIENT)
public class ParticleColorHandler {

    private static Field colorField;
    private static Field particlesField;
    private static Field stateField;

    static {
        try {
            colorField = TerrainParticle.class.getDeclaredField("color");
            colorField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            try {
                colorField = TerrainParticle.class.getDeclaredField("tintColor");
                colorField.setAccessible(true);
            } catch (NoSuchFieldException ex) {
                StardustIndustryMetalAddon.LOGGER.error("无法找到 TerrainParticle 的颜色字段", ex);
            }
        }
        try {
            particlesField = ParticleEngine.class.getDeclaredField("particles");
            particlesField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            StardustIndustryMetalAddon.LOGGER.error("无法找到 ParticleEngine 的 particles 字段", e);
        }
        try {
            stateField = TerrainParticle.class.getDeclaredField("state");
            stateField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            StardustIndustryMetalAddon.LOGGER.error("无法找到 TerrainParticle 的 state 字段", e);
        }
    }

    @SubscribeEvent
    public static void onClientTick(ClientTickEvent.Post event) {
        if (particlesField == null || colorField == null || stateField == null) return;

        var particleEngine = net.minecraft.client.Minecraft.getInstance().particleEngine;
        if (particleEngine == null) return;

        try {
            @SuppressWarnings("unchecked")
            var particles = (java.util.Queue<net.minecraft.client.particle.Particle>) particlesField.get(particleEngine);
            for (var particle : particles) {
                if (particle instanceof TerrainParticle terrainParticle) {
                    try {
                        var state = (net.minecraft.world.level.block.state.BlockState) stateField.get(terrainParticle);
                        if (state.getBlock() instanceof MetalBlock metalBlock) {
                            colorField.setInt(terrainParticle, metalBlock.getColor());
                        }
                    } catch (Exception ignored) {
                    }
                }
            }
        } catch (Exception ignored) {
        }
    }
}
