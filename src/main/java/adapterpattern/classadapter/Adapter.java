package adapterpattern.classadapter;


import adapterpattern.Adaptee;

public class Adapter extends Adaptee implements Target {

    @Override
    public void targetMethodA() {
        System.out.println("Adapter targetMethodA invoked.");
        methodA();
    }

    @Override
    public void targetMethodB() {
        System.out.println("Adapter targetMethodB invoked.");
        methodB();
    }
}
