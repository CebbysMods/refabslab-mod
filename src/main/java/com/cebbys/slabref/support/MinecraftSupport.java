package com.cebbys.slabref.support;

import java.util.HashSet;
import java.util.Set;

import com.google.common.collect.ImmutableSet;

import net.minecraft.util.Identifier;

public class MinecraftSupport {

	private static final ImmutableSet<Identifier> IDENTIFIERS;
	private static final String[] STRINGS;

	public static ImmutableSet<Identifier> getSlabIdentifiers() {
		return IDENTIFIERS;
	}
	
	private static ImmutableSet<Identifier> generateIdentifiers() {
		Set<Identifier> set = new HashSet<Identifier>();
		for(String s : STRINGS) {
			set.add(new Identifier(s));
		}
		return ImmutableSet.copyOf(set);
	}
	
	static {
		STRINGS = new String[] {
				"minecraft:prismarine_slab","minecraft:prismarine_brick_slab","minecraft:dark_prismarine_slab",
				"minecraft:oak_slab","minecraft:spruce_slab","minecraft:birch_slab","minecraft:jungle_slab",
				"minecraft:acacia_slab","minecraft:dark_oak_slab","minecraft:stone_slab","minecraft:smooth_stone_slab",
				"minecraft:sandstone_slab","minecraft:cut_sandstone_slab","minecraft:petrified_oak_slab",
				"minecraft:cobblestone_slab","minecraft:brick_slab","minecraft:stone_brick_slab",
				"minecraft:nether_brick_slab","minecraft:quartz_slab","minecraft:red_sandstone_slab",
				"minecraft:cut_red_sandstone_slab","minecraft:purpur_slab","minecraft:polished_granite_slab",
				"minecraft:smooth_red_sandstone_slab","minecraft:mossy_stone_brick_slab","minecraft:polished_diorite_slab",
				"minecraft:mossy_cobblestone_slab","minecraft:end_stone_brick_slab","minecraft:smooth_sandstone_slab",
				"minecraft:smooth_quartz_slab","minecraft:granite_slab","minecraft:andesite_slab",
				"minecraft:red_nether_brick_slab","minecraft:polished_andesite_slab","minecraft:diorite_slab",
				"minecraft:crimson_slab","minecraft:warped_slab","minecraft:blackstone_slab",
				"minecraft:polished_blackstone_brick_slab","minecraft:polished_blackstone_slab"
		};
		IDENTIFIERS = generateIdentifiers();
	}
}
