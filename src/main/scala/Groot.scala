import components.Components
import components.config.ConfigLoader


object Groot extends App {
  val config = new ConfigLoader().load()
  val components = new Components(config)

  components.printer.print_anything()
}
