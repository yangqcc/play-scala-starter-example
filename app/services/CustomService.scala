package services

import javax.inject._

trait CustomService {
  def getName(): String

  def showName(name: String): String
}

@Singleton
class MyService extends CustomService {
  override def getName(): String = "this is customService!"

  override def showName(name: String): String = name
}
