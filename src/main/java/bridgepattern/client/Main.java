package bridgepattern.client;

import bridgepattern.ChatSoftware;
import bridgepattern.GameSoftware;
import bridgepattern.HuaweiMobilePhone;
import bridgepattern.MobilePhoneAbstract;

/**
 * 类的功能层次结构 Vs 实现层次结构
 * 类的功能层次结构 :
 *     父类具备基本功能
 *     子类在父类基础上添加新的功能
 * 实现层次结构 :
 *     父类声明抽象方法定义相关接口（API）
 *     子类通过具体方法来实现接口（API）
 * 抽象与实现相分离：抽象与实现相分离，从而让抽象与实现分别独立开来，分别定义接口，有助于系统分层及产生更好的结构化系统；
 * 更好的拓展性：系统拓展时，因为抽象与实现已经分别独立，所以可以进行分别拓展不会相互影响，从而大大提高系统拓展性。
 */
public class Main {

    public static void main(String[] args) {
        MobilePhoneAbstract m1 = new HuaweiMobilePhone(new ChatSoftware());
        HuaweiMobilePhone m2 = new HuaweiMobilePhone(new GameSoftware());

        m1.run();
        m2.run();

        m2.gameTurboRun();
    }
}
