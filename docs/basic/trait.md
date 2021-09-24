# 特质
之前一直把 trait 当成接口使用，其实 trait 功能比接口丰富，它甚至可以直接当成类使用。

## 简单介绍

### [Sample 1]([https://github.com/MikuSugar/scala-design/tree/master/src/main/scala/basic/trait_study/sample1](https://github.com/MikuSugar/scala-design/tree/master/src/main/scala/basic/trait_study/sample1))

看下面的代码，特质中可以有未实现的方法，实现的方法，常量/变量

```scala
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
```

### [Sample 2](https://github.com/MikuSugar/scala-design/tree/master/src/main/scala/basic/trait_study/sample2)

特质可以直接当类来用

```scala
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
  new Hahaha {}.show()
}

```

### [Sample 3](https://github.com/MikuSugar/scala-design/tree/master/src/main/scala/basic/trait_study/sample3)

特质可以用来拓展类/特质

```scala
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

```



