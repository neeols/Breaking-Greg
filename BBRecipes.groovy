    mods.gregtech.large_chemical_reactor.recipeBuilder() // Chloroacetone
        .inputs(metaitem('dustAluminiumTrichloride') * 15)
        .fluidInputs(fluid('chlorine') * 10000, fluid('acetone') * 10000)
        .fluidOutputs(fluid('chloroacetone') * 20000)
        .duration(200) // 10 secondssitll 
        .EUt(2048) // EV recipe
     .buildAndRegister()

    mods.gregtech.chemical_reactor.recipeBuilder() // lithium hydride
        .inputs(ore('dustLithium')
        .fluidINputs(liquid('hydrogen') * 1000)
        .outputs(metaitem('dustLithiumHydride'))
        .duration(200)
        .EUt(120)
        .buildAndRegister()

    mods.gregtech.blast_furnace.recipeBuilder() //ALuminium Trichloride
            .inputs(ore('dustAluminium') * 2)
            .fluidItems(liquid('hydrochloric_acid') * 6000)
            .outputs(metaitem('dustAluminiumTrichloride') * 2)
            .duration(200)
            .EUt(120)
            .buildAndRegister()

