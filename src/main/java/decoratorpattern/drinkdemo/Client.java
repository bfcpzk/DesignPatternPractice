package decoratorpattern.drinkdemo;

/**
 * 装饰器模式包含如下几个角色：
 *
 * 抽象构件（Component ）：
 *                       Component 是一个接口或者抽象类，也是最原始的对象，属于模式核心角色。用于定义一些抽象的接口
 *                       或功能，以便后面的 ConcreteComponent 和 ConcreteDecorator角色去实现；
 * 具体构件（ConcreteComponent）：
 *                       ConcreteComponent 是最原始、最基本的接口或抽象类 Component 的实现，在模式中充当
 *                       被装饰的角色，也就说我们模式要装饰的对象就是 ConcreteComponent；
 * 抽象装饰角色（Decorator）：
 *                       Decorator 一般是一个抽象类，实现接口或者抽象方法，其内部不一定有抽象方法定义，有可能只是
 *                       单纯继承下 Component 抽象构件；但是其内部一般都有一个 Component 角色的引用，表示
 *                       Decorator 需要装饰的对象，一般该对象是 private 或者 protected 声明；
 * 具体装饰器角色**（**ConcreteDecorator）：
 *                       具体的装饰器类，继承 Decorator 抽象装饰器角色，实现了 Component 抽象角色中定义的接口（API）。
 */
public class Client {

    public static void main(String[] args) {
        Drink lemonade = new Lemonade();
        Drink lemonadeWithIce = new IceAdditive(lemonade);
        Drink lemonadeWithIceAndSugar = new SugarAdditive(lemonadeWithIce);

        lemonade.make();
        lemonadeWithIce.make();
        lemonadeWithIceAndSugar.make();
    }
}
