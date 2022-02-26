package bridgepattern;

public class IPhone extends MobilePhoneAbstract {

    public IPhone(SoftwareImplementor implementor) {
        super(implementor);
    }

    @Override
    public void run() {
        this.softwareImplementor.rawRun();
    }

    public void gpuTurboRun() {
        System.out.println("GPU Turbo run starts ...");
        run();
        System.out.println("GPU Turbo run ends ...");
    }
}
