package components.config

import com.typesafe.config.Config

trait ConfigAware {
  val conf: Config
}
