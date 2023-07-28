### java新特性

#### record
* 简单声明
``` java
public record Student(Integer id,String name,String email,Integer age) {}
```
#### 箭头方法
#### var 关键字
#### sealed 密闭类
* `sealed` 修饰类和接口，被sealed修饰的类和接口不可以被继承
* 