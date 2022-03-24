工厂的设计模式定义：任何可以产生对象的方法和类，都可以称之为工厂。单例也是一种工厂

工厂方法(简单工厂、静态工厂)、抽象工厂
### 任意定制交通工具
继承 Moveable
```java
Moveable m = new Car();
m.go();
Moveable m = new Plane();
m.go();
Moveable m = new Broom();
m.go();
```
### 任意定制生产过程
```java
// 简单工厂
Moveable m = new CarFactory().create();
m.go();
// 简单工厂没下面这种方式扩展性好
SimpleVehicleFactory simpleVehicleFactory = new SimpleVehicleFactory();
simpleVehicleFactory.createCar().go();
```
### 任意定制同一族产品(抽象工厂)
抽象工厂与工厂方法各自的优缺点：

(1)工厂方法容易在产品维度进行扩展，但产生系列产品时不方便，且易造成工厂类泛滥

(2)抽象工厂增加新产品时，要修改AbstractFactory等多处地方，但产生系列产品时很方便

补充：形容词用接口，名词用抽象类

食品是现实生活中存在的，但是它又不是具体的事物，所以用抽象类来表示

Moveable是指可移动的东西，这是某个东西的属性，这个东西可能不止一种属性，我们可以使用多个接口来表示