package com.brandon47167.chemistry.items;

import com.brandon47167.chemistry.Chemistry;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    public ItemBase(){
        super(new Item.Properties().group(Chemistry.TAB));
    }
}
