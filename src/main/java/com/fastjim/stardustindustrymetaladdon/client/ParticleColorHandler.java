package com.fastjim.stardustindustrymetaladdon.client;

import com.fastjim.stardustindustrymetaladdon.StardustIndustryMetalAddon;
import net.minecraft.client.particle.TerrainParticle;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientTickEvent;

import java.lang.reflect.Field;

@EventBusSubscriber(modid = StardustIndustryMetalAddon.MODID, value = Dist.CLIENT)
public class ParticleColorHandler {

    // 目标颜色：浅灰色
    private static final int TARGET_COLOR = 0xFFC0C0C0;

    // 缓存 TerrainParticle 的 color 字段
    private static Field colorField;

    static {
        try {
            colorField = TerrainParticle.class.getDeclaredField("color");
            colorField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            try {
                // 备选字段名
                colorField = TerrainParticle.class.getDeclaredField("tintColor");
                colorField.setAccessible(true);
            } catch (NoSuchFieldException ex) {
                StardustIndustryMetalAddon.LOGGER.error("无法找到 TerrainParticle 的颜色字段", ex);
            }
        }
    }

    @SubscribeEvent
    public static void onClientTick(ClientTickEvent.Post event) {
        // 每帧遍历所有粒子，将金属方块的粒子改为灰色
        var particleEngine = net.minecraft.client.Minecraft.getInstance().particleEngine;
        if (particleEngine == null) return;

        // 通过反射获取粒子列表
        try {
            var particlesField = particleEngine.getClass().getDeclaredField("particles");
            particlesField.setAccessible(true);
            var particles = (java.util.Queue<net.minecraft.client.particle.Particle>) particlesField.get(particleEngine);

            for (net.minecraft.client.particle.Particle particle : particles) {
                if (particle instanceof TerrainParticle terrainParticle) {
                    // 检查是否是金属方块
                    try {
                        var stateField = TerrainParticle.class.getDeclaredField("state");
                        stateField.setAccessible(true);
                        var state = (net.minecraft.world.level.block.state.BlockState) stateField.get(terrainParticle);
                        if (state.getBlock() instanceof com.fastjim.stardustindustrymetaladdon.block.MetalBlock) {
                            if (colorField != null) {
                                colorField.setInt(terrainParticle, TARGET_COLOR);
                            }
                        }
                    } catch (Exception ignored) {
                        // 忽略单个粒子的反射错误
                    }
                }
            }
        } catch (Exception ignored) {
            // 忽略反射错误
        }
    }
}