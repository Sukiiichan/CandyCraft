package com.crypticmushroom.candycraft.misc;

import com.crypticmushroom.candycraft.blocks.CCBlocks;
import com.crypticmushroom.candycraft.blocks.tileentity.AlchemyRecipes;
import com.crypticmushroom.candycraft.items.CCItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CCRecipes
{
	public static void init()
	{
		new AlchemyRecipes();

		GameRegistry.addSmelting(CCBlocks.licoriceOre, new ItemStack(CCItems.licorice), 2);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.SUGAR, 4), new ItemStack(CCBlocks.sugarBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(CCBlocks.marshmallowPlanks, 4, 0), new ItemStack(CCBlocks.marshmallowLog, 1, 0));
		GameRegistry.addShapelessRecipe(new ItemStack(CCBlocks.marshmallowPlanks, 4, 1), new ItemStack(CCBlocks.marshmallowLog, 1, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(CCBlocks.marshmallowPlanks, 4, 2), new ItemStack(CCBlocks.marshmallowLog, 1, 2));
		GameRegistry.addShapelessRecipe(new ItemStack(CCBlocks.marshmallowPlanks, 4, 3), new ItemStack(CCBlocks.marshmallowLog, 1, 3));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK, 1), new ItemStack(CCItems.marshmallowStick));
		GameRegistry.addShapelessRecipe(new ItemStack(CCItems.honeyShard, 9), new ItemStack(CCBlocks.honeyBlock));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.marshmallowFence, 2), "PPP", "PPP", 'P', new ItemStack(CCItems.marshmallowStick));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.marshmallowStairs, 4), "P  ", "PP ", "PPP", 'P', new ItemStack(CCBlocks.marshmallowPlanks, 1, 0));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.marshmallowStairs2, 4), "P  ", "PP ", "PPP", 'P', new ItemStack(CCBlocks.marshmallowPlanks, 1, 1));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.marshmallowStairs3, 4), "P  ", "PP ", "PPP", 'P', new ItemStack(CCBlocks.marshmallowPlanks, 1, 2));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.marshmallowHalfStep, 6), "PPP", 'P', new ItemStack(CCBlocks.marshmallowPlanks, 0, 0));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.marshmallowHalfStep2, 6), "PPP", 'P', new ItemStack(CCBlocks.marshmallowPlanks, 0, 1));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.marshmallowHalfStep3, 6), "PPP", 'P', new ItemStack(CCBlocks.marshmallowPlanks, 0, 2));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.licoriceBrick, 3), "PP", "PP", 'P', new ItemStack(CCItems.licorice));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.licoriceBlock, 1), "PPP", "PPP", "PPP", 'P', new ItemStack(CCItems.licorice));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.licoriceBrickStairs, 4), "P  ", "PP ", "PPP", 'P', new ItemStack(CCBlocks.licoriceBrick));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.licoriceHalfStep, 6), "PPP", 'P', new ItemStack(CCBlocks.licoriceBrick));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.candyCaneBlock, 2), "PP", "PP", 'P', new ItemStack(CCItems.candyCane));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.candyCaneFence, 2), "PPP", "PPP", 'P', new ItemStack(CCItems.candyCane));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.candyCaneStairs, 4), "P  ", "PP ", "PPP", 'P', new ItemStack(CCBlocks.candyCaneBlock));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.candyCaneHalfStep, 6), "PPP", 'P', new ItemStack(CCBlocks.candyCaneBlock));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.candyCaneWall, 2), "PPP", "PPP", 'P', new ItemStack(CCBlocks.candyCaneBlock));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.sugarFactory, 2), "PSP", "SBS", "PSP", 'P', new ItemStack(CCItems.licorice), 'S', new ItemStack(CCItems.marshmallowStick), 'B', new ItemStack(CCBlocks.candyCaneWall));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.sugarFurnace, 1), "PPP", "P P", "PPP", 'P', new ItemStack(CCItems.licorice));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.sugarBlock, 1), "PP", "PP", 'P', new ItemStack(Items.SUGAR));
		GameRegistry.addRecipe(new ItemStack(CCItems.licoriceSword, 1), "L", "L", "P", 'P', new ItemStack(CCItems.marshmallowStick), 'L', new ItemStack(CCItems.licorice));
		GameRegistry.addRecipe(new ItemStack(CCItems.licoriceShovel, 1), "L", "P", "P", 'P', new ItemStack(CCItems.marshmallowStick), 'L', new ItemStack(CCItems.licorice));
		GameRegistry.addRecipe(new ItemStack(CCItems.licoricePickAxe, 1), "LLL", " P ", " P ", 'P', new ItemStack(CCItems.marshmallowStick), 'L', new ItemStack(CCItems.licorice));
		GameRegistry.addRecipe(new ItemStack(CCItems.licoriceAxe, 1), "LL", "LP", " P", 'P', new ItemStack(CCItems.marshmallowStick), 'L', new ItemStack(CCItems.licorice));
		GameRegistry.addRecipe(new ItemStack(CCItems.licoriceHoe, 1), "LL", " P", " P", 'P', new ItemStack(CCItems.marshmallowStick), 'L', new ItemStack(CCItems.licorice));
		GameRegistry.addRecipe(new ItemStack(CCItems.licoriceHelmet, 1), "LLL", "L L", 'L', new ItemStack(CCItems.licorice));
		GameRegistry.addRecipe(new ItemStack(CCItems.licoricePlate, 1), "L L", "LLL", "LLL", 'L', new ItemStack(CCItems.licorice));
		GameRegistry.addRecipe(new ItemStack(CCItems.licoriceLeggings, 1), "LLL", "L L", "L L", 'L', new ItemStack(CCItems.licorice));
		GameRegistry.addRecipe(new ItemStack(CCItems.licoriceBoots, 1), "L L", "L L", 'L', new ItemStack(CCItems.licorice));
		GameRegistry.addRecipe(new ItemStack(CCItems.dragibusStick, 1), "L ", " D", 'L', new ItemStack(Items.FISHING_ROD), 'D', new ItemStack(CCItems.dragibus));
		GameRegistry.addRecipe(new ItemStack(CCItems.fork, 1), "L  ", " L ", "  L", 'L', new ItemStack(Items.IRON_INGOT));
		GameRegistry.addRecipe(new ItemStack(CCItems.marshmallowStick, 4), "L", "L", 'L', CCBlocks.marshmallowPlanks);
		GameRegistry.addRecipe(new ItemStack(CCBlocks.marshmallowLadder, 3), "L L", "LLL", "L L", 'L', new ItemStack(CCItems.marshmallowStick));
		GameRegistry.addRecipe(new ItemStack(CCItems.marshmallowDoor), "LL", "LL", "LL", 'L', CCBlocks.marshmallowPlanks);
		GameRegistry.addRecipe(new ItemStack(CCBlocks.marshmallowWorkbench), "LL", "LL", 'L', CCBlocks.marshmallowPlanks);
		GameRegistry.addRecipe(new ItemStack(CCBlocks.marshmallowChest, 1), "PPP", "P P", "PPP", 'P', CCBlocks.marshmallowPlanks);
		GameRegistry.addRecipe(new ItemStack(CCBlocks.honeyTorch, 4), "P", "O", 'P', new ItemStack(CCItems.honeyShard), 'O', new ItemStack(CCItems.marshmallowStick));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.honeyBlock, 1), "PPP", "PPP", "PPP", 'P', new ItemStack(CCItems.honeyShard));
		GameRegistry.addRecipe(new ItemStack(CCItems.honeyHelmet, 1), "LLL", "L L", 'L', new ItemStack(CCItems.honeycomb));
		GameRegistry.addRecipe(new ItemStack(CCItems.honeyPlate, 1), "L L", "LLL", "LLL", 'L', new ItemStack(CCItems.honeycomb));
		GameRegistry.addRecipe(new ItemStack(CCItems.honeyLeggings, 1), "LLL", "L L", "L L", 'L', new ItemStack(CCItems.honeycomb));
		GameRegistry.addRecipe(new ItemStack(CCItems.honeyBoots, 1), "L L", "L L", 'L', new ItemStack(CCItems.honeycomb));
		GameRegistry.addRecipe(new ItemStack(CCItems.honeySword, 1), "L", "L", "P", 'P', new ItemStack(CCItems.marshmallowStick), 'L', new ItemStack(CCItems.honeycomb));
		GameRegistry.addRecipe(new ItemStack(CCItems.honeyShovel, 1), "L", "P", "P", 'P', new ItemStack(CCItems.marshmallowStick), 'L', new ItemStack(CCItems.honeycomb));
		GameRegistry.addRecipe(new ItemStack(CCItems.honeyPickaxe, 1), "LLL", " P ", " P ", 'P', new ItemStack(CCItems.marshmallowStick), 'L', new ItemStack(CCItems.honeycomb));
		GameRegistry.addRecipe(new ItemStack(CCItems.honeyAxe, 1), "LL", "LP", " P", 'P', new ItemStack(CCItems.marshmallowStick), 'L', new ItemStack(CCItems.honeycomb));
		GameRegistry.addRecipe(new ItemStack(CCItems.honeyHoe, 1), "LL", " P", " P", 'P', new ItemStack(CCItems.marshmallowStick), 'L', new ItemStack(CCItems.honeycomb));
		GameRegistry.addRecipe(new ItemStack(CCItems.honeyArrow, 4), "L", "P", "O", 'P', new ItemStack(CCItems.marshmallowStick), 'L', new ItemStack(CCItems.honeyShard), 'O', new ItemStack(CCItems.candyCane));
		GameRegistry.addShapelessRecipe(new ItemStack(CCItems.gummyBall), new ItemStack(CCItems.gummy));
		GameRegistry.addShapelessRecipe(new ItemStack(CCItems.PEZDust, 9), new ItemStack(CCItems.PEZ));
		GameRegistry.addRecipe(new ItemStack(CCItems.PEZ, 1), "PPP", "PPP", "PPP", 'P', new ItemStack(CCItems.PEZDust));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.PEZBlock, 1), "PPP", "PPP", "PPP", 'P', new ItemStack(CCItems.PEZ));
		GameRegistry.addRecipe(new ItemStack(CCItems.PEZHelmet, 1), "LLL", "L L", 'L', new ItemStack(CCItems.PEZ));
		GameRegistry.addRecipe(new ItemStack(CCItems.PEZPlate, 1), "L L", "LLL", "LLL", 'L', new ItemStack(CCItems.PEZ));
		GameRegistry.addRecipe(new ItemStack(CCItems.PEZLeggings, 1), "LLL", "L L", "L L", 'L', new ItemStack(CCItems.PEZ));
		GameRegistry.addRecipe(new ItemStack(CCItems.PEZBoots, 1), "L L", "L L", 'L', new ItemStack(CCItems.PEZ));
		GameRegistry.addRecipe(new ItemStack(Items.BUCKET), "L L", " L ", 'L', new ItemStack(CCItems.PEZDust));
		GameRegistry.addRecipe(new ItemStack(Items.SHEARS), new Object[] { " #", "# ", '#', CCItems.PEZDust });
		GameRegistry.addRecipe(new ItemStack(CCBlocks.cottonCandyBlock, 4), "PP", "PP", 'P', new ItemStack(CCItems.cottonCandy));
		GameRegistry.addRecipe(new ItemStack(CCItems.fork, 1), "L  ", " L ", "  L", 'L', new ItemStack(CCItems.PEZDust));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.cranberrySpikes, 2), "LL", 'L', new ItemStack(CCItems.cranberryScale));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.cottonCandyStairs, 4), "P  ", "PP ", "PPP", 'P', new ItemStack(CCBlocks.cottonCandyBlock));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.cottonCandyHalfStep, 6), "PPP", 'P', new ItemStack(CCBlocks.cottonCandyBlock));
		GameRegistry.addRecipe(new ItemStack(CCItems.cottonCandyBed, 1), "PPP", "OOO", 'P', new ItemStack(CCBlocks.cottonCandyBlock), 'O', CCBlocks.marshmallowPlanks);
		GameRegistry.addRecipe(new ItemStack(CCBlocks.mintBlock, 1), "PP", "PP", 'P', new ItemStack(CCBlocks.greenSeeweed));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.raspberryBlock, 1), "PP", "PP", 'P', new ItemStack(CCBlocks.pinkSeeweed));
		GameRegistry.addRecipe(new ItemStack(CCItems.waterMask, 1), "PPP", "POP", 'P', new ItemStack(CCItems.sugarCrystal), 'O', new ItemStack(CCItems.cranberryScale));
		GameRegistry.addRecipe(new ItemStack(CCItems.jellyBoots, 1), "P P", "O O", 'P', new ItemStack(CCItems.sugarCrystal), 'O', new ItemStack(CCBlocks.jellyShockAbsorber));
		GameRegistry.addRecipe(new ItemStack(CCItems.PEZSword, 1), "L", "L", "P", 'P', new ItemStack(CCItems.marshmallowStick), 'L', new ItemStack(CCItems.PEZ));
		GameRegistry.addRecipe(new ItemStack(CCItems.PEZShovel, 1), "L", "P", "P", 'P', new ItemStack(CCItems.marshmallowStick), 'L', new ItemStack(CCItems.PEZ));
		GameRegistry.addRecipe(new ItemStack(CCItems.PEZPickaxe, 1), "LLL", " P ", " P ", 'P', new ItemStack(CCItems.marshmallowStick), 'L', new ItemStack(CCItems.PEZ));
		GameRegistry.addRecipe(new ItemStack(CCItems.PEZAxe, 1), "LL", "LP", " P", 'P', new ItemStack(CCItems.marshmallowStick), 'L', new ItemStack(CCItems.PEZ));
		GameRegistry.addRecipe(new ItemStack(CCItems.PEZHoe, 1), "LL", " P", " P", 'P', new ItemStack(CCItems.marshmallowStick), 'L', new ItemStack(CCItems.PEZ));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.sugarSpikes, 8), "LL", 'L', new ItemStack(CCItems.sugarCrystal));
		GameRegistry.addShapelessRecipe(new ItemStack(CCBlocks.caramelGlass1, 1), new ItemStack(CCBlocks.caramelGlass0));
		GameRegistry.addShapelessRecipe(new ItemStack(CCBlocks.caramelGlass2, 1), new ItemStack(CCBlocks.caramelGlass1));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.caramelPane0, 16), "PPP", "PPP", 'P', new ItemStack(CCBlocks.caramelGlass0));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.caramelPane1, 16), "PPP", "PPP", 'P', new ItemStack(CCBlocks.caramelGlass1));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.caramelPane2, 16), "PPP", "PPP", 'P', new ItemStack(CCBlocks.caramelGlass2));
		GameRegistry.addShapelessRecipe(new ItemStack(CCBlocks.caramelPane1, 1), new ItemStack(CCBlocks.caramelPane0));
		GameRegistry.addShapelessRecipe(new ItemStack(CCBlocks.caramelPane2, 1), new ItemStack(CCBlocks.caramelPane1));
		GameRegistry.addRecipe(new ItemStack(CCItems.waffle, 1), "PP", "PP", "PP", 'P', new ItemStack(CCItems.waffleNugget));
		GameRegistry.addRecipe(new ItemStack(CCItems.marshmallowSword, 1), "L", "L", "P", 'P', new ItemStack(CCItems.marshmallowStick), 'L', CCBlocks.marshmallowPlanks);
		GameRegistry.addRecipe(new ItemStack(CCItems.marshmallowShovel, 1), "L", "P", "P", 'P', new ItemStack(CCItems.marshmallowStick), 'L', CCBlocks.marshmallowPlanks);
		GameRegistry.addRecipe(new ItemStack(CCItems.marshmallowPickaxe, 1), "LLL", " P ", " P ", 'P', new ItemStack(CCItems.marshmallowStick), 'L', CCBlocks.marshmallowPlanks);
		GameRegistry.addRecipe(new ItemStack(CCItems.marshmallowAxe, 1), "LL", "LP", " P", 'P', new ItemStack(CCItems.marshmallowStick), 'L', CCBlocks.marshmallowPlanks);
		GameRegistry.addRecipe(new ItemStack(CCItems.marshmallowHoe, 1), "LL", " P", " P", 'P', new ItemStack(CCItems.marshmallowStick), 'L', CCBlocks.marshmallowPlanks);
		GameRegistry.addRecipe(new ItemStack(CCBlocks.advancedSugarFactory, 1), "LPL", "POP", "LPL", 'P', new ItemStack(CCItems.candiedCherry), 'L', new ItemStack(CCBlocks.redTrampojelly), 'O', new ItemStack(CCBlocks.sugarFactory));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.alchemyTable, 1), "LPL", "POP", "LPL", 'P', CCBlocks.marshmallowLog, 'L', new ItemStack(CCItems.PEZ), 'O', new ItemStack(CCBlocks.caramelGlass0));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.alchemyTable, 1), "LPL", "POP", "LPL", 'P', CCBlocks.marshmallowLog, 'L', new ItemStack(CCItems.PEZ), 'O', new ItemStack(CCBlocks.caramelGlass1));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.alchemyTable, 1), "LPL", "POP", "LPL", 'P', CCBlocks.marshmallowLog, 'L', new ItemStack(CCItems.PEZ), 'O', new ItemStack(CCBlocks.caramelGlass2));
		GameRegistry.addRecipe(new ItemStack(Items.COOKIE, 2), "PCP", 'P', new ItemStack(CCBlocks.flour), 'C', new ItemStack(Items.DYE, 1, 3));
		GameRegistry.addRecipe(new ItemStack(CCItems.dynamite, 3), "PCP", "PCP", "PCP", 'P', new ItemStack(CCItems.waffleNugget), 'C', new ItemStack(CCItems.nougatPowder));
		GameRegistry.addShapelessRecipe(new ItemStack(CCItems.glueDynamite, 1), new ItemStack(CCItems.dynamite), new ItemStack(CCItems.chewingGum));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.nougatBlock, 1), "PPP", "PPP", "PPP", 'P', new ItemStack(CCItems.nougatPowder));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.bananaBlock, 1), "PP", "PP", 'P', new ItemStack(CCBlocks.bananaSeaweed));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.chewingGumPuddle, 1), "PP", 'P', new ItemStack(CCItems.chewingGum));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.chewingGumBlock, 1), "PP", "PP", 'P', new ItemStack(CCItems.chewingGum));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.iceCreamStairs0, 4), "P  ", "PP ", "PPP", 'P', new ItemStack(CCBlocks.iceCream, 1, 0));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.iceCreamStairs1, 4), "P  ", "PP ", "PPP", 'P', new ItemStack(CCBlocks.iceCream, 1, 1));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.iceCreamStairs2, 4), "P  ", "PP ", "PPP", 'P', new ItemStack(CCBlocks.iceCream, 1, 2));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.iceCreamStairs3, 4), "P  ", "PP ", "PPP", 'P', new ItemStack(CCBlocks.iceCream, 1, 3));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.iceCreamHalfStep0, 6), "PPP", 'P', new ItemStack(CCBlocks.iceCream, 1, 0));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.iceCreamHalfStep1, 6), "PPP", 'P', new ItemStack(CCBlocks.iceCream, 1, 1));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.iceCreamHalfStep2, 6), "PPP", 'P', new ItemStack(CCBlocks.iceCream, 1, 2));
		GameRegistry.addRecipe(new ItemStack(CCBlocks.iceCreamHalfStep3, 6), "PPP", 'P', new ItemStack(CCBlocks.iceCream, 1, 3));
		GameRegistry.addRecipe(new ItemStack(CCItems.honeyBolt, 1), "  P", " P ", "C  ", 'P', new ItemStack(CCItems.honeyShard), 'C', new ItemStack(CCItems.candyCane));
		GameRegistry.addRecipe(new ItemStack(CCItems.caramelCrossbow, 1), "P  ", " C ", "  C", 'P', new ItemStack(CCItems.caramelBow), 'C', new ItemStack(CCBlocks.caramelBlock));
	}
}
