package adapterpattern.objectadapter;

public class Client {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.targetMethodA();
        target.targetMethodB();
    }
}
