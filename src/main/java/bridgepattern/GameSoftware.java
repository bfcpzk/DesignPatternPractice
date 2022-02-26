package bridgepattern;

public class GameSoftware implements SoftwareImplementor {
    @Override
    public void rawRun() {
        System.out.println("GameSoftware rawRun ...");
    }
}
