package components.printer

import components.config.ConfigAware

trait PrinterComponentImpl
  extends PrinterComponentAware
    with ConfigAware {

  val printer: Printer = new Printer(conf.getString("printer.anything"))
}
