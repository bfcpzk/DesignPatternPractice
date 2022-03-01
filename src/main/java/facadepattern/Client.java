package facadepattern;

/**
 * 外观模式的定义是：为各个子系统的一组接口提供一致的调用窗口或门面，使得子系统更容易使用，使得复杂的子系统与客户端分离解耦。
 *
 * 外观模式的一般类图如上所示，包含的角色列举如下：
 *
 * 门面角色（Facade）：
 *                  门面模式自然少不了门面角色，这就是我们的 Facade 类，一般情况下，该角色会将客户端的请求委派给相应的
 *                  子系统去调用，也就说该角色实际没有啥实质性的业务逻辑，只是一个单纯的委派类，用来实现客户端和子系统的
 *                  解耦；
 * 子系统角色（SubSystem）：
 *                  子系统并不是一个单一的类，而是众多类的一个系统集合。一般而言，子系统并不知道门面角色的存在，也就说对
 *                  子系统而言，门面角色是完全透明的。子系统各自实现自己的功能，包括类之间的相互调用等，这些都不受门面角
 *                  色的影响。
 *
 * 外观模式优点：
 *            1. 实现了子系统与客户端之间关系的解耦；
 *            2. 客户端屏蔽了子系统组件，使得客户端所需处理的对象数目有所减少，使得子系统使用起来更加容易。
 * 外观模式缺点：
 *            1. 增加新的子系统可能需要修改外观类或者客户端的源代码，违背了开闭原则；
 *            2. 外观类并没有阻断子系统被外部使用的可能性。(singleton 可以解决)
 */
public class Client {

    public static void main(String[] args) {
        UserSystem userSystem = new UserSystem();
        FireSystem fireSystem = new FireSystem();

        Facade facade = new Facade(userSystem, fireSystem);
        facade.shooting();
    }
}
