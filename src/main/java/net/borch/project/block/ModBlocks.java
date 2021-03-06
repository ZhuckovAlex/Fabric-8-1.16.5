package net.borch.project.block;

import net.borch.project.ProjectMod;
import net.borch.project.block.custom.ModMagmaBlock;
import net.borch.project.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block MAGMA = registerBlock("magma",
            new ModMagmaBlock(FabricBlockSettings.of(Material.STONE).strength(2.5f)
                    .breakByTool(FabricToolTags.PICKAXES, 0).requiresTool()));


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(ProjectMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(ProjectMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ModItemGroup.SUN)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering ModBlocks for " + ProjectMod.MOD_ID);
    }
}