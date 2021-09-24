package me.mikusugar.scala.design
package basic.trait_study.sample1

/**
 * @author mikusugar
 */
trait Voice {

  def start(): String

  def printVoice(): Unit = {
    println(s"${age}岁的${name}在${start()}叫")
  }

  val name: String

  var age: Int

}

class Cat extends Voice {
  override def start(): String = "喵喵喵"

  override val name: String = "猫猫"
  override var age: Int = 1
}

object Test extends App {
  val cat = new Cat
  cat.printVoice()
}
