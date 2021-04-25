package components.config

import com.typesafe.config.{Config, ConfigFactory}

trait ConfigImpl extends ConfigAware {
  lazy val conf: Config = ConfigFactory.parseResources("application.conf").resolve()
}
