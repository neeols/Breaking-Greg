/*import crafttweaker.world.IFacing;
import crafttweaker.block.IBlock;
import crafttweaker.block.IBlockState;
import crafttweaker.item.IIngredient;
import crafttweaker.item.IItemStack;

import mods.gregtech.multiblock.Builder;
import mods.gregtech.multiblock.FactoryBlockPattern;
import mods.gregtech.multiblock.IBlockMatcher;
import mods.gregtech.multiblock.MultiblockAbility;
import mods.gregtech.multiblock.RelativeDirection;
import mods.gregtech.multiblock.FactoryMultiblockShapeInfo;
import mods.gregtech.multiblock.IBlockInfo;
import mods.gregtech.multiblock.IBlockWorldState;
import mods.gregtech.multiblock.Multiblock;

import mods.gregtech.MetaTileEntities;

import mods.gregtech.recipe.FactoryRecipeMap;

import mods.gregtech.render.ITextureArea;
import mods.gregtech.render.MoveType;
import mods.gregtech.render.ICubeRenderer;
import mods.gregtech.render.Textures;

import scripts.CommonVars.makeShaped as makeShaped;

var loc = "dealer";
var meta = 28010;

var dealer = Builder.start(loc, meta)
    .withPattern(
        FactoryBlockPattern.start(RelativeDirection.RIGHT, RelativeDirection.DOWN, RelativeDirection.FRONT)
            .aisle(
                "AFFFA",
                "CDDDC",
                "CDDDC",
                "CDDDC",
                "ABBBA"
            )
            .aisle(
                "FDDDF",
                "D---D",
                "D---D",
                "D---D",
                "BDDDB"
            )
            .aisle(
                "FDDDF",
                "D---D",
                "G-H-G",
                "D---D",
                "BDDDB"
            )
            .aisle(
                "FDDDF",
                "D---D",
                "G-H-G",
                "D---D",
                "BDDDB"
            )
            .aisle(
                "FDDDF",
                "D---D",
                "D---D",
                "D---D",
                "BDDDB"
            )
            .aisle(
                "AFFFA",
                "CDDDC",
                "CDSDC",
                "CDDDC",
                "ABBBA"
            )
            .whereOr("D",
                <metastate:modpack:bronzebismuthcasing>,
                IBlockMatcher.abilityPartPredicate(
                    MultiblockAbility.INPUT_ENERGY,
                    MultiblockAbility.IMPORT_ITEMS,
                    MultiblockAbility.EXPORT_ITEMS
                ))
            .where("S", IBlockMatcher.controller(loc))
            .where("-", IBlockInfo.EMPTY)
            .where('F', <metastate:gregtech:meta_block_frame_188:14>) // incoloy frame
            .where('G', <metastate:appliedenergistics2:quartz_vibrant_glass>) // vibrant quartz glass
            .where('H', <metastate:modpack:compressedmethblock>) // double compressed meth
            .where('A', <metastate:gregtech:meta_block_compressed_188:14>) // incoloy block
            .where('B', <metastate:gregtech:meta_block_frame_18:15>) // bismuth bronze frame
            .where('C', <metastate:chisel:laboratory:11>) // steel lab casing

            .build())
    .addDesign(
        FactoryMultiblockShapeInfo.start()
            .aisle(
                "AFFFA",
                "CDDDC",
                "CNMJC",
                "CDDDC",
                "ABBBA"
            )
            .aisle(
                "FDDDF",
                "D---D",
                "D---D",
                "D---D",
                "BDDDB"
            )
            .aisle(
                "FDDDF",
                "D---D",
                "G-H-G",
                "D---D",
                "BDDDB"
            )
            .aisle(
                "FDDDF",
                "D---D",
                "G-H-G",
                "D---D",
                "BDDDB"
            )
            .aisle(
                "FDDDF",
                "D---D",
                "D---D",
                "D---D",
                "BDDDB"
            )
            .aisle(
                "AFFFA",
                "CDDDC",
                "CDSDC",
                "CDDDC",
                "ABBBA"
            )
            .where("D", <metastate:modpack:bronzebismuthcasing>)
            .where("S", IBlockMatcher.controller(loc))
            .where("-", IBlockInfo.EMPTY)
            .where('F', <metastate:gregtech:meta_block_frame_188:14>) // incoloy frame
            .where('G', <metastate:appliedenergistics2:quartz_vibrant_glass>) // vibrant quartz glass
            .where('H', <metastate:modpack:compressedmethblock>) // double compressed meth
            .where('A', <metastate:gregtech:meta_block_compressed_188:14>) // incoloy block
            .where('B', <metastate:gregtech:meta_block_frame_18:15>) // bismuth bronze frame
            .where('C', <metastate:chisel:laboratory:11>) // steel lab casing
            .where("N", MetaTileEntities.ITEM_IMPORT_BUS[0], IFacing.west())
            .where("M", MetaTileEntities.ITEM_EXPORT_BUS[0], IFacing.west())
            .where("J", MetaTileEntities.ENERGY_INPUT_HATCH[2], IFacing.west())

            .build())
    .clearTooltips(true)
    .withRecipeMap(
        FactoryRecipeMap.start(loc)
          .minInputs(1)
            .maxInputs(1)
            .minOutputs(1)
            .maxOutputs(1)
            .build())
    //.withBaseTexture(<metastate:modpack:bronzebismuthcasing>)
    .buildAndRegister();

//dealer.hasMufflerMechanics = false;
//dealer.hasMaintenanceMechanics = false;

makeShaped("dealer", <metaitem:multiblocktweaker:dealer>,
    ["ABA",
     "CDC",
     "EFE"],
    { A : <modpack:bronzebismuthcasing>,
      B : <modpack:pvcglove>,
      C : <ore:circuitIv>,
      D : <modpack:emptysyringe>,
      E : <gregtech:meta_item_1:191>,
      F : <modpack:compressedmethblock>
    });

dealer.recipeMap.recipeBuilder()
    .duration(2)
    .EUt(32768)
    .inputs(<modpack:crystalmeth> * 64)
    .outputs(<gregtech:meta_gem_exquisite:276> * 8)
    .buildAndRegister();

dealer.recipeMap.recipeBuilder()
    .duration(2)
    .EUt(32768)
    .inputs(<modpack:methsyringe> * 16)
    .outputs(<gregtech:meta_gem_exquisite:276> * 4)
    .buildAndRegister();*/