package com.brandon47167.chemistry.blocks;

import com.brandon47167.chemistry.Chemistry;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(Chemistry.TAB));
    }
}
