# 特质
之前一直把 trait 当成接口使用，其实 trait 功能比接口丰富，它甚至可以直接当成类使用。

## 简单介绍

看下面的代码，特质中可以有未实现的方法，实现的方法，常量/变量

```scala
trait Voice {

  def start(): String

  def printVoice(): Unit = {
    println(s"${age}岁的${name}在${start()}叫")
  }

  val name: String

  var age: Int

}
```

