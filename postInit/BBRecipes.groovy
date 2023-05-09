   import gregtech.api.metatileentity.multiblock.CleanroomType


    mods.gregtech.large_chemical_reactor.recipeBuilder() // Chloroacetone
        .inputs(metaitem('dustAluminiumTrichloride') * 15)
        .inputs(fluid('chlorine') * 10000, fluid('acetone') * 10000)
        .fluidOutputs(fluid('chloroacetone') * 20000)
        .duration(200) // 10 secondssitll 
        .EUt(2048) // EV recipe
     .buildAndRegister()

    mods.gregtech.large_chemical_reactor.recipeBuilder() // phenylacetone
        .inputs(metaitem('dustAluminiumTrichloride') * 2)
        .inputs(liquid('benzene') * 44000, liquid('chloroacetone') * 7000)
        .fluidOutputs(liquid('phenylacetone') * 6000)
        .duration(200)
        .EUt(1048)
        .buildAndRegister();

    mods.gregtech.chemical_reactor.recipeBuilder() // lithium hydride
        .inputs(ore('dustLithium')
        .inputs(liquid('hydrogen') * 1000)
        .outputs(metaitem('dustLithiumHydride'))
        .duration(200)
        .EUt(120)
        .buildAndRegister()

    mods.gregtech.blast_furnace.recipeBuilder() //ALuminium Trichloride
            .inputs(ore('dustAluminium') * 2)
            .items(liquid('hydrochloric_acid') * 6000)
            .outputs(metaitem('dustAluminiumTrichloride') * 2)
            .duration(200)
            .EUt(120)
            .buildAndRegister()

    mods.gregtech.chemical_reactor.recipeBuilder() //Lithium Aluminium Hydride
            .inputs(metaitem('dustLithiumHydride') * 4)
            .inputs(liquid('aluminium_trichloride') * 1000)
            .outputs(metaitem('dustLithiumAluminiumHydride'), metaitem('dustLithiumChloride') * 3)
            .duration(200)
            .EUt(120)
            .buildAndRegister()
    
    mods.gregtech.chemical_reactor.recipeBuilder() // methylamine
            .fluidInputs(liquid('methanol') * 1000, liquid('ammonia') * 1000)
            .fluidOutputs(liquid('water') * 1000, liquid('methylamine') * 1000)    
            .circuitMeta(10)    
            .duration(200)    
            .EUt(120)    
            .buildAndRegister()    
                
    mods.gregtech.chemical_reactor.recipeBuilder()
            .inputs(metaitem('dustLithiumHydride'))
            .inputs(liquid('methylamine') * 1000, liquid('phenylacetone') * 500)   
            .fluidOutputs(liquid('methamphetamine') * 1000)
            .cleanroom(CleanroomType.CLEANROOM)
            .duration(200)    
            .EUt(8192)    
            .buildAndRegister()  
              
    mods.gregtech.fluid_solidifier.recipeBuilder()
            .inputs(liquid('methamphetamine') * 1000)
            .notConsumable(metaitem('shape.mold.plate'))
            .outputs(metaitem('plateMethamphetamine'))    
            .duration(10)    
            .EUt(120)
            .buildAndRegister()    
                
    mods.gregtech.forge_hammer.recipeBuilder()
            .inputs(metaitem('plateMethamphetamine')
            .outputs(item('contenttweaker:emptysyringe')    
            .duration(10)
            .EUt(120)           
            .buildAndRegister()         
                     
   crafting.shapedBuilder()
            .name('empty_syringe')
            .output(item('nomifactory:empty_syringe'))
            .matrix('  N',
                    ' R ',
                    'P. ')
            .key('N', item('nomifactory:needle'))
            .key('R', metaitem('rodIron'))
            .key('P', item('nomifactory:plunger'))
            .register()        
