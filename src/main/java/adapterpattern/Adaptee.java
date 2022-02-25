package adapterpattern;

/**
 * 实际想要调用的方法，但是不能够直接提供给customer，比如公司有接口规范，methodA 的业务逻辑需要通过
 * targetMethodA 让 client 调用，而且由于 methodA 使用的地方比较多，不能直接修改。通过适配器，能够让
 * client 通过目标接口来调用具体方法。
 */
public class Adaptee {

    public void methodA() {
        System.out.println("Adaptee methodA invoked.");
    }

    public void methodB() {
        System.out.println("Adaptee methodA invoked.");
    }
}
