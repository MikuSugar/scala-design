package me.mikusugar.scala.design
package basic.trait_study.sample3

/**
 * @author mikusugar
 */
class Animal {
  def info():String={
    "动物都是生命"
  }
}
trait Mammal extends Animal {

}
object Test extends App {
  println(new Mammal{}.info())
}
