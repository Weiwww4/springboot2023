## java新特性

### record
* 简单声明
``` java
public record Student(Integer id,String name,String email,Integer age) {}
```
### 箭头方法
### TextBlock文本块
* 文本块 是Java 13` 中引入的新特性
* 可以更直观的方式定义多行字符串
* 简化编写包含大段文本的字符串，并且保留文本格式的结构
* 使用文本块可以避免在字符串中添加大量的转义字符和换行符
``` java
// 文本块的格式
String textBlock = """
                  Hello, 
                  Welcome to 
                  Java Text Blocks.
                  """;
```


### var局部变量
* java10引入了局部变量类型推断，可以使用`var`关键字来进行类型推断
* `var`是一个保留字，不是关键字，可以使用var来声明变量（但不推荐）
``` java
private static final int var = 2;
```
* `var`在方法体中声明，必须要有初值(类型推断)
* 每次只能声明一个变量，不可复合声明多个变量
``` java
var s1 = "Hello",age = 17 // 错误用法
```
* `var`动态类型是编译器根据变量所赋的值来进行类型推断
* `var` 代替显示类型，代码简洁（少写代码，但是要慎用）


### sealed 密闭类
* `sealed` 密闭类 是`Java 15` 中引入的预览特性
* `sealed` 修饰类和接口，被sealed修饰的类和接口只能被特定的类继承
* `permits` 指定继承的子类，只有被`permits`指定的类，才能使用继承父类
* 子类不能再有子类
``` java 
package com.faintdream.java.features;

public sealed class Sealed permits SealedChild1,SealedChild2,SealedChild3{
    public void print(){
        System.out.println("sealed 定义封闭类");
    }
}
```
* `sealed`必须使用final(不可变类)修饰
```
package com.faintdream.java.features;

public final class SealedChild1 extends Sealed {
    @Override
    public void print(){
        System.out.println("sealed 密闭类的子类必须使用final修饰");
    }
}
```