package net.borch.project;

import net.borch.project.block.ModBlocks;
import net.borch.project.item.ModItems;
import net.borch.project.registries.ModRegistries;
import net.fabricmc.api.ModInitializer;

public class ProjectMod implements ModInitializer {
	public static final String MOD_ID = "fabric_project";
	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModRegistries.registerModFuels();

		System.out.println("Hello Fabric world!");
	}
}
