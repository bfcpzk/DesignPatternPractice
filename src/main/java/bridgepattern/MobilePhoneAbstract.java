package bridgepattern;

public abstract class MobilePhoneAbstract {
    protected SoftwareImplementor softwareImplementor;

    public MobilePhoneAbstract(SoftwareImplementor implementor) {
        this.softwareImplementor = implementor;
    }

    public abstract void run();
}
