package sora.dwarfcoal.init;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.common.Mod;
import sora.dwarfcoal.DwarfCoal;
import sora.dwarfcoal.blocks.BlockBase;
import sora.dwarfcoal.blocks.BlockDwarfTorch;
import sora.dwarfcoal.blocks.BlockDwarfWallTorch;

import static net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus.MOD;

@Mod.EventBusSubscriber(bus = MOD, modid = DwarfCoal.MODID)
public class ModBlocks {
  public static final Block CHARCOAL_BLOCK = new BlockBase("charcoal_block", Block.Properties.from(Blocks.COAL_BLOCK));
  public static final Block DWARF_TORCH = new BlockDwarfTorch("dwarf_torch");
  public static final Block DWARF_WALL_TORCH = new BlockDwarfWallTorch("dwarf_wall_torch");


  static {
     new ModBlocks();
  }

}
