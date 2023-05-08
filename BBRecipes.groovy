mods.gregtech.large_chemical_reactor.recipeBuilder() // Chloroacetone
    .inputs(metaitem('dustAluminiumTrichloride') * 15)
    .fluidInputs(fluid('chlorine') * 10000, fluid('acetone') * 10000)
    .fluidOutputs(fluid('chloroacetone') * 20000)
    .duration(200) // 10 secondssitll 
    .EUt(512) // HV recipe
    .buildAndRegister()

// not confident this is how fluids work lol
