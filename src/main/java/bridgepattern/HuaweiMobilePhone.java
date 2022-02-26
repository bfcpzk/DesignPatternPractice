package bridgepattern;

public class HuaweiMobilePhone extends MobilePhoneAbstract {


    public HuaweiMobilePhone(SoftwareImplementor implementor) {
        super(implementor);
    }

    @Override
    public void run() {
        // 使用委托：调用HuaWeiMobilePhone的run时，实际调用的是SoftImplementor的rawrun
        this.softwareImplementor.rawRun();
    }

    public void gameTurboRun() {
        System.out.println("Game Turbo Run starts ...");
        run();
        System.out.println("Game Turbo Run ends ...");
    }
}
