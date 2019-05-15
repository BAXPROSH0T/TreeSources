package com.bax.treesources.init;

import java.util.ArrayList;
import java.util.List;

import com.bax.treesources.blocks.BlockBase;
import com.bax.treesources.blocks.LogBlockBase;
import com.bax.treesources.blocks.leaves.AluminumLeaves;
import com.bax.treesources.blocks.leaves.BronzeLeaves;
import com.bax.treesources.blocks.leaves.CoalLeaves;
import com.bax.treesources.blocks.leaves.CopperLeaves;
import com.bax.treesources.blocks.leaves.DiamondLeaves;
import com.bax.treesources.blocks.leaves.DirtLeaves;
import com.bax.treesources.blocks.leaves.EmeraldLeaves;
import com.bax.treesources.blocks.leaves.EnergizedLeaves;
import com.bax.treesources.blocks.leaves.GoldenLeaves;
import com.bax.treesources.blocks.leaves.GravelLeaves;
import com.bax.treesources.blocks.leaves.HostileLeaves;
import com.bax.treesources.blocks.leaves.IronLeaves;
import com.bax.treesources.blocks.leaves.LapisLeaves;
import com.bax.treesources.blocks.leaves.LeadLeaves;
import com.bax.treesources.blocks.leaves.MuddyLeaves;
import com.bax.treesources.blocks.leaves.NickelLeaves;
import com.bax.treesources.blocks.leaves.ObsidianLeaves;
import com.bax.treesources.blocks.leaves.PassiveLeaves;
import com.bax.treesources.blocks.leaves.QuartzLeaves;
import com.bax.treesources.blocks.leaves.RockyLeaves;
import com.bax.treesources.blocks.leaves.SandyLeaves;
import com.bax.treesources.blocks.leaves.ShimmeringLeaves;
import com.bax.treesources.blocks.leaves.SilverLeaves;
import com.bax.treesources.blocks.leaves.SteelLeaves;
import com.bax.treesources.blocks.leaves.TinLeaves;
import com.bax.treesources.blocks.logs.AluminumLogs;
import com.bax.treesources.blocks.logs.BronzeLogs;
import com.bax.treesources.blocks.logs.CoalLogs;
import com.bax.treesources.blocks.logs.CopperLogs;
import com.bax.treesources.blocks.logs.DiamondLogs;
import com.bax.treesources.blocks.logs.DirtLogs;
import com.bax.treesources.blocks.logs.EmeraldLogs;
import com.bax.treesources.blocks.logs.EnergizedLogs;
import com.bax.treesources.blocks.logs.GoldenLogs;
import com.bax.treesources.blocks.logs.GravelLogs;
import com.bax.treesources.blocks.logs.HostileLogs;
import com.bax.treesources.blocks.logs.IronLogs;
import com.bax.treesources.blocks.logs.LapisLogs;
import com.bax.treesources.blocks.logs.LeadLogs;
import com.bax.treesources.blocks.logs.MuddyLogs;
import com.bax.treesources.blocks.logs.NickelLogs;
import com.bax.treesources.blocks.logs.ObsidianLogs;
import com.bax.treesources.blocks.logs.PassiveLogs;
import com.bax.treesources.blocks.logs.QuartzLogs;
import com.bax.treesources.blocks.logs.RockyLogs;
import com.bax.treesources.blocks.logs.SandyLogs;
import com.bax.treesources.blocks.logs.ShimmeringLogs;
import com.bax.treesources.blocks.logs.SilverLogs;
import com.bax.treesources.blocks.logs.SteelLogs;
import com.bax.treesources.blocks.logs.TinLogs;
import com.bax.treesources.blocks.saplings.AluminumSapling;
import com.bax.treesources.blocks.saplings.BronzeSapling;
import com.bax.treesources.blocks.saplings.CoalSapling;
import com.bax.treesources.blocks.saplings.CopperSapling;
import com.bax.treesources.blocks.saplings.DiamondSapling;
import com.bax.treesources.blocks.saplings.DirtSapling;
import com.bax.treesources.blocks.saplings.EmeraldSapling;
import com.bax.treesources.blocks.saplings.EnergizedSapling;
import com.bax.treesources.blocks.saplings.GoldenSapling;
import com.bax.treesources.blocks.saplings.GravelSapling;
import com.bax.treesources.blocks.saplings.HostileSapling;
import com.bax.treesources.blocks.saplings.IronSapling;
import com.bax.treesources.blocks.saplings.LapisSapling;
import com.bax.treesources.blocks.saplings.LeadSapling;
import com.bax.treesources.blocks.saplings.MuddySapling;
import com.bax.treesources.blocks.saplings.NickelSapling;
import com.bax.treesources.blocks.saplings.ObsidianSapling;
import com.bax.treesources.blocks.saplings.PassiveSapling;
import com.bax.treesources.blocks.saplings.QuartzSapling;
import com.bax.treesources.blocks.saplings.RockySapling;
import com.bax.treesources.blocks.saplings.SandySapling;
import com.bax.treesources.blocks.saplings.ShimmeringSapling;
import com.bax.treesources.blocks.saplings.SilverSapling;
import com.bax.treesources.blocks.saplings.SteelSapling;
import com.bax.treesources.blocks.saplings.TinSapling;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	
	//Trees
	
	//Dirt
	public static final Block DIRT_SAPLING = new DirtSapling("dirt_sapling");
	public static final Block DIRT_LOGS = new DirtLogs("dirt_logs", Material.WOOD);
	public static final Block DIRT_LEAVES = new DirtLeaves("dirt_leaves");
	
	//sand
	public static final Block SANDY_SAPLING = new SandySapling("sandy_sapling");
	public static final Block SANDY_LOGS = new SandyLogs ("sandy_logs", Material.WOOD);
	public static final Block SANDY_LEAVES = new SandyLeaves("sandy_leaves");
	
	//gravel
	public static final Block GRAVEL_SAPLING = new GravelSapling("gravel_sapling");
	public static final Block GRAVEL_LOGS = new GravelLogs("gravel_logs", Material.PLANTS);
	public static final Block GRAVEL_LEAVES = new GravelLeaves("gravel_leaves");
	
	//CobbleStone
	public static final Block ROCKY_SAPLING = new RockySapling("rocky_sapling");
	public static final Block ROCKY_LOGS = new RockyLogs ("rocky_logs", Material.WOOD);
	public static final Block ROCKY_LEAVES = new RockyLeaves("rocky_leaves");
	
	//clay
	public static final Block MUDDY_SAPLING = new MuddySapling("muddy_sapling");
	public static final Block MUDDY_LOGS = new MuddyLogs ("muddy_logs", Material.WOOD);
	public static final Block MUDDY_LEAVES = new MuddyLeaves("muddy_leaves");
	
	//coal
	public static final Block COAL_SAPLING = new CoalSapling("coal_sapling");
	public static final Block COAL_LOGS = new CoalLogs ("coal_logs", Material.WOOD);
	public static final Block COAL_LEAVES = new CoalLeaves("coal_leaves");
	
	//lapis
	public static final Block LAPIS_SAPLING = new LapisSapling("lapis_sapling");
	public static final Block LAPIS_LOGS = new LapisLogs ("lapis_logs", Material.WOOD);
	public static final Block LAPIS_LEAVES = new LapisLeaves("lapis_leaves");
	
	//redstone
	public static final Block ENERGIZED_SAPLING = new EnergizedSapling("energized_sapling");
	public static final Block ENERGIZED_LOGS = new EnergizedLogs ("energized_logs", Material.WOOD);
	public static final Block ENERGIZED_LEAVES = new EnergizedLeaves ("energized_leaves");
	
	//quartz
	public static final Block QUARTZ_SAPLING = new QuartzSapling("quartz_sapling");
	public static final Block QUARTZ_LOGS = new QuartzLogs ("quartz_logs", Material.WOOD);
	public static final Block QUARTZ_LEAVES = new QuartzLeaves("quartz_leaves");
	
	//iron
	public static final Block IRON_SAPLING = new IronSapling("iron_sapling");
	public static final Block IRON_LOGS = new IronLogs ("iron_logs", Material.WOOD);
	public static final Block IRON_LEAVES = new IronLeaves("iron_leaves");
	
	//copper
	public static final Block COPPER_SAPLING = new CopperSapling("copper_sapling");
	public static final Block COPPER_LOGS = new CopperLogs ("copper_logs", Material.WOOD);
	public static final Block COPPER_LEAVES = new CopperLeaves ("copper_leaves");
	
	//silver
	public static final Block SILVER_SAPLING = new SilverSapling ("silver_sapling");
	public static final Block SILVER_LOGS = new SilverLogs ("silver_logs", Material.WOOD);
	public static final Block SILVER_LEAVES = new SilverLeaves ("silver_leaves");
	
	//nickel
	public static final Block NICKEL_SAPLING = new NickelSapling ("nickel_sapling");
	public static final Block NICKEL_LOGS = new NickelLogs ("nickel_logs", Material.WOOD);
	public static final Block NICKEL_LEAVES = new NickelLeaves ("nickel_leaves");
	
	//tin
	public static final Block TIN_SAPLING = new TinSapling("tin_sapling");
	public static final Block TIN_LOGS = new TinLogs ("tin_logs", Material.WOOD);
	public static final Block TIN_LEAVES = new TinLeaves("tin_leaves");
	
	//lead
	public static final Block LEAD_SAPLNG = new LeadSapling("lead_sapling");
	public static final Block LEAD_LOGS = new LeadLogs ("lead_logs", Material.WOOD);
	public static final Block LEAD_LEAVES = new LeadLeaves ("lead_leaves");
	
	//bronze
	public static final Block BRONZE_SAPLING = new BronzeSapling("bronze_sapling");
	public static final Block BRONZE_LOGS = new BronzeLogs ("bronze_logs", Material.WOOD);
	public static final Block BRONZE_LEAVES = new BronzeLeaves("bronze_leaves");
	
	//steel
	public static final Block STEEL_SAPLING = new SteelSapling ("steel_sapling");
	public static final Block STEEL_LOGS = new SteelLogs ("steel_logs", Material.WOOD);
	public static final Block STEEL_LEAVES =new SteelLeaves ("steel_leaves");
	
	//diamond
	public static final Block DIAMOND_SAPLING = new DiamondSapling("diamond_sapling");
	public static final Block DIAMOND_LOGS = new DiamondLogs ("diamond_logs", Material.WOOD);
	public static final Block DIAMOND_LEAVES = new DiamondLeaves("diamond_leaves");

	
	//emerald
	public static final Block EMERALD_SAPLING = new EmeraldSapling("emerald_sapling");
	public static final Block EMERALD_LOGS = new EmeraldLogs ("emerald_logs", Material.WOOD);
	public static final Block EMERALD_LEAVES = new EmeraldLeaves("emerald_leaves");
	
	//nether star
	public static final Block SHIMMERING_SAPLING = new ShimmeringSapling("shimmering_sapling");
	public static final Block SHIMMERING_LOGS = new ShimmeringLogs ("shimmering_logs", Material.WOOD);
	public static final Block SHIMMERING_LEAVES = new ShimmeringLeaves("shimmering_leaves");
	
	//obsidian
	public static final Block OBSIDIAN_SAPLING = new ObsidianSapling("obsidian_sapling");
	public static final Block OBSIDIAN_LOGS = new ObsidianLogs ("obsidian_logs", Material.WOOD);
	public static final Block OBSIDIAN_LEAVES = new ObsidianLeaves("obsidian_leaves");
	
	//passive mob
	public static final Block PASSIVE_SAPLING = new PassiveSapling("passive_sapling");
	public static final Block PASSIVE_LOGS = new PassiveLogs ("passive_logs", Material.WOOD);
	public static final Block PASSIVE_LEAVES = new PassiveLeaves("passive_leaves");
	
	//hostile mob
	public static final Block HOSTILE_SAPLING = new HostileSapling("hostile_sapling");
	public static final Block HOSTILE_LOGS = new HostileLogs ("hostile_logs", Material.WOOD);
	public static final Block HOSTILE_LEAVES = new HostileLeaves("hostile_leaves");
	
	//gold
	public static final Block GOLDEN_SAPLING = new GoldenSapling ("golden_sapling");
	public static final Block GOLDEN_LOGS = new GoldenLogs ("golden_logs", Material.WOOD);
	public static final Block GOLDEN_LEAVES = new GoldenLeaves ("golden_leaves");
	
	//aluminum
	public static final Block ALUMINUM_SAPLING = new AluminumSapling ("aluminum_sapling");
	public static final Block ALUMINUM_LOGS = new AluminumLogs ("aluminum_logs", Material.WOOD);
	public static final Block ALUMINUM_LEAVES = new AluminumLeaves ("aluminum_leaves");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
