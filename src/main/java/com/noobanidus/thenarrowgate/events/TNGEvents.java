package com.noobanidus.thenarrowgate.events;

import com.noobanidus.thenarrowgate.TheNarrowGate;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.AbstractHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.world.GetCollisionBoxesEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.List;

@Mod.EventBusSubscriber(modid= TheNarrowGate.MODID)
public class TNGEvents {
    @SubscribeEvent
    public static void onCollision(GetCollisionBoxesEvent event) {
        Entity entity = event.getEntity();

        if (!(entity instanceof AbstractHorse) || !entity.isBeingRidden()) return;

        List<AxisAlignedBB> collisions = event.getCollisionBoxesList();
        for (int i = collisions.size() - 1; i >= 0; i--) {
            AxisAlignedBB aabb = collisions.get(i);
            BlockPos pos = new BlockPos(aabb.minX + (aabb.maxX - aabb.minX) * 0.5f, aabb.minY + (aabb.maxY - aabb.minY) * 0.5f, aabb.minZ + (aabb.maxZ - aabb.minZ) * 0.5f);
            IBlockState state = event.getWorld().getBlockState(pos);
            if (state.getBlock() instanceof BlockFence || state.getBlock() instanceof BlockFenceGate) {
                BlockPos[] positions = new BlockPos[]{pos.east(), pos.west(), pos.north(), pos.south()};
                for (BlockPos newPos : positions) {
                    IBlockState newState = event.getWorld().getBlockState(newPos);
                    if (newState.getBlock() instanceof BlockFenceGate && newState.getValue(BlockFenceGate.OPEN)) {
                        event.getCollisionBoxesList().remove(i);
                        break;
                    }
                }
            }
        }
    }
}

