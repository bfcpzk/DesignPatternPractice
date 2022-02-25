package adapterpattern.objectadapter;

import adapterpattern.Adaptee;

public class Adapter extends Target {

    private Adaptee adaptee;

    public Adapter() {
        this.adaptee = new Adaptee();
    }

    @Override
    public void targetMethodA() {
        System.out.println("Adapter targetMethodA invoked.");
        adaptee.methodA();
    }

    @Override
    public void targetMethodB() {
        System.out.println("Adapter targetMethodB invoked.");
        adaptee.methodB();
    }
}
