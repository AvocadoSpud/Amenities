package com.avocadospud.amenities.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;


public class OakTableBlock extends Block {

    public OakTableBlock() {
        super(Block.Properties.create(Material.WOOD)
                .hardnessAndResistance(2.0f, 10.0f)
                .sound(SoundType.WOOD)
                .notSolid()
                .harvestTool(ToolType.AXE)

        );
    }
}
