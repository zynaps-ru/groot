package components.config

import com.typesafe.config.{Config, ConfigFactory}

class ConfigLoader {
  val conf: Config = ConfigFactory.parseResources("application.conf").resolve()

  def load(): Config = {
    conf
  }
}
