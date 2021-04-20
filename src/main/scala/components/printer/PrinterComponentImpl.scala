package components.printer

import components.config.ConfigImpl

trait PrinterComponentImpl
  extends PrinterComponentAware
    with ConfigImpl {

  val printer: Printer = new Printer(conf.getString("printer.anything"))
}
