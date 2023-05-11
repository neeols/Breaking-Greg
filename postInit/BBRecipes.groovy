import gregtech.api.metatileentity.multiblock.CleanroomType
import net.minecraft.item.ItemStack
import net.minecraft.item.Item

lcr = recipemap('large_chemical_reactor')
ebf = recipemap('electric_blast_furnace')
chemical_reactor = recipemap('chemical_reactor')
fluid_solidifier = recipemap('fluid_solidifier')
forge_hammer = recipemap('forge_hammer')

   lcr.recipeBuilder() // Chloroacetone
            .inputs(metaitem('dustAluminiumTrichloride') * 15)
            .fluidInputs(fluid('chlorine') * 10000, fluid('acetone') * 10000)
            .fluidOutputs(fluid('chloroacetone') * 10000)
            .duration(200) // 10 seconds
            .EUt(2048) // EV recipe
            .buildAndRegister()

   lcr.recipeBuilder() // phenylacetone
            .inputs(metaitem('dustAluminiumTrichloride') * 2)
            .fluidInputs(fluid('benzene') * 44000, fluid('chloroacetone') * 7000)
            .fluidOutputs(fluid('phenylacetone') * 6000)
            .duration(200)
            .EUt(1048)
            .buildAndRegister()

    chemical_reactor.recipeBuilder() // lithium hydride
            .inputs(ore('dustLithium'))
            .fluidInputs(fluid('hydrogen') * 1000)
            .outputs(metaitem('dustLithiumHydride'))
            .duration(200)
            .EUt(120)
            .buildAndRegister()

    ebf.recipeBuilder() //ALuminium Trichloride
            .inputs(ore('dustAluminium') * 2)
            .fluidInputs(fluid('hydrochloric_acid') * 6000)
            .outputs(metaitem('dustAluminiumTrichloride') * 2)
            .duration(200)
            .EUt(120)
            .buildAndRegister()

    chemical_reactor.recipeBuilder() //Lithium Aluminium Hydride
            .inputs(metaitem('dustLithiumHydride') * 4)
            .fluidInputs(fluid('aluminium_trichloride') * 1000)
            .outputs(metaitem('dustLithiumAluminiumHydride'), metaitem('dustLithiumChloride') * 3)
            .duration(200)
            .EUt(120)
            .buildAndRegister()

    chemical_reactor.recipeBuilder() // methylamine
            .fluidInputs(fluid('methanol') * 2000, fluid('ammonia') * 2000)
            .fluidOutputs(fluid('water') * 2000, fluid('methylamine') * 2000)
            .circuitMeta(4)
            .duration(200)
            .EUt(120)
            .buildAndRegister()

    chemical_reactor.recipeBuilder()
            .inputs(metaitem('dustLithiumHydride') * 2)
            .fluidInputs(fluid('methylamine') * 2000, fluid('phenylacetone') * 1000)
            .fluidOutputs(fluid('methamphetamine') * 2000)
            .cleanroom(CleanroomType.CLEANROOM)
            .duration(200)
            .EUt(8192)
            .buildAndRegister()

    fluid_solidifier.recipeBuilder()
            .fluidInputs(fluid('methamphetamine') * 1000)
            .notConsumable(metaitem('shape.mold.plate'))
            .outputs(metaitem('plateMethamphetamine'))
            .duration(10)
            .EUt(120)
            .buildAndRegister()

    forge_hammer.recipeBuilder()
            .inputs(metaitem('plateMethamphetamine'))
            .outputs(item('nomifactory:crystalmeth'))
            .duration(10)
            .EUt(120)
            .buildAndRegister()

   crafting.addShaped('syringe', item('nomifactory:emptysyringe'),
        [
          [null, null, item('nomifactory:needle')],
          [null, metaitem('stickIron'), null],
          [item('nomifactory:plunger'), null, null]
        ]
    )
