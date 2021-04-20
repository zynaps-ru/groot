package components

import com.typesafe.config.Config
import components.printer.Printer

class Components(config: Config) {
  val printer: Printer = new Printer(config.getString("printer.anything"))

}
