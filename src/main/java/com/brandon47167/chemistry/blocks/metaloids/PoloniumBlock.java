package com.brandon47167.chemistry.blocks.metaloids;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class PoloniumBlock extends Block{
    public PoloniumBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(3.0f, 6.0f)
                .sound(SoundType.METAL)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
