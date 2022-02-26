package bridgepattern;

public class ChatSoftware implements SoftwareImplementor {
    @Override
    public void rawRun() {
        System.out.println("ChatSoftware rawRun ...");
    }
}
