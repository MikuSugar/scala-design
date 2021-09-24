package me.mikusugar.scala.design
package basic.trait_study.sample2

/**
 * @author mikusugar
 */
trait Hahaha {
  val hahaha: String = "hahahahahahahaha"

  def show(): Unit = {
    println(hahaha)
  }
}

object Test extends App with Hahaha {
  show()
}
