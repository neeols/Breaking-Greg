import gregtech.api.GregTechAPI.MaterialEvent
import gregtech.api.unification.material.Material
import gregtech.api.unification.Elements
import gregtech.api.unification.material.properties.ToolProperty
import gregtech.api.unification.material.properties.BlastProperty
import gregtech.api.fluids.fluidType.FluidType;

event_manager.listen { MaterialEvent event ->

    new Material.Builder(20001, "methamphetamine")
        .fluid()
        .color(0xaffff6)
        .components(material('carbon') * 10, material('hydrogen') * 15, material('nitrogen') * 1)
        .flags("disable_decomposition", "generate_plate")
        .build()
  
      new Material.Builder(20002, "chloroacetone")
        .fluid()
        .color(0xffbf00)
        .components(material('carbon') * 3, material('hydrogen') * 5, material('chlorine') * 1, material('oxygen') * 1)
        .flags("disable_decomposition")
        .build()
  
      new Material.Builder(20003, "aluminium_trichloride")
        .dust().fluid()
        .color(0xd3d3d3)
        .components(material('aluminium') * 1, material('chlorine') * 3)
        .flags("disable_decomposition")
        .build()
  
      new Material.Builder(20004, "methylamine")
        .fluid(FluidType.getByName("gas"))
        .color(0xffffff)
        .components(material('carbon') * 1, material('hydrogen') * 3, material('nitrogen') * 1, material('hydrogen') * 2)
        .flags("disable_decomposition")
        .build()
  
      new Material.Builder(20005, "phenylacetone")
        .fluid()
        .color(0xffffff)
        .components(material('carbon') * 9, material('hydrogen') * 10, material('oxygen') * 1)
        .flags("disable_decomposition")
        .build()
  
      new Material.Builder(20006, "lithium_aluminium_hydride")
        .dust()
        .color(0xa9a9a9)
        .components(material('lithium') * 1, material('aluminium') * 1, material('hydrogen') * 4)
        .flags("disable_decomposition")
        .build()
  
      new Material.Builder(20007, "lithium_hydride")
        .dust()
        .color(0x72a38c)
        .components(material('lithium') * 1, material('hydrogen') * 1)
        .build()
  
      new Material.Builder(20008, "lithium_chloride")
        .dust()
        .color(0xffffff)
        .components(material('lithium') * 1, material('chlorine') * 1)
        .build()
}
