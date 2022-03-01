package facadepattern;

public class Facade {
    private FireSystem fireSystem;
    private UserSystem userSystem;

    public Facade(UserSystem userSystem, FireSystem fireSystem) {
        this.fireSystem = fireSystem;
        this.userSystem = userSystem;
    }

    public void shooting() {
        fireSystem.useBullet(); // 上子弹
        fireSystem.fire(); // 开火
        userSystem.loseBlood(); // 敌人掉血
        userSystem.addScore(); // 自己加分
    }
}
