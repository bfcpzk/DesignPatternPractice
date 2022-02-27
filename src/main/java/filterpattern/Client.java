package filterpattern;

import java.util.ArrayList;
import java.util.List;


/**
 * 可插拔：过滤器的设计概念要求其是支持可插拔设计的.
 * 有序性：过滤器是被设计为一组组的过滤装置，要实现数据过滤，就必须有顺序性要求.
 * 过滤器的独立性：每种过滤器必须是独立的实体，其状态不受其它过滤器的影响，
 * 每个过滤器都有自己独立的数据输入输出接口，只要各个过滤器之间传送的数据遵守共同的规约就可以相连接。
 */
public class Client {

    public static void main(String[] args) {
        // 原始数据集合
        List<Rubbish> rubbishList = new ArrayList<>();
        rubbishList.add(new Rubbish("果壳", false, false, true, false));
        rubbishList.add(new Rubbish("陶瓷", false, false, true, false));
        rubbishList.add(new Rubbish("菜根菜叶", false, false, false, true));
        rubbishList.add(new Rubbish("果皮", false, false, false, true));
        rubbishList.add(new Rubbish("水银温度计", true, false, false, false));
        rubbishList.add(new Rubbish("电池", true, false, false, false));
        rubbishList.add(new Rubbish("灯泡", true, false, false, false));
        rubbishList.add(new Rubbish("废纸塑料", false, true, false, false));
        rubbishList.add(new Rubbish("金属和布料", false, true, false, false));
        rubbishList.add(new Rubbish("玻璃", false, true, false, false));

        // 四种不同的过滤标准
        Criteria dryRubbishCriteria = new DryRubbishCriteria();
        Criteria wetRubbishCriteria = new WetRubbishCriteria();
        Criteria harmfulRubbishCriteria = new HarmfulRubbishCriteria();
        Criteria recycledRubbishCriteria = new RecycledRubbishCriteria();

        System.out.println("干垃圾: ");
        printRubbishes(dryRubbishCriteria.rubbishFilter(rubbishList));

        System.out.println("湿垃圾: ");
        printRubbishes(wetRubbishCriteria.rubbishFilter(rubbishList));

        System.out.println("有害垃圾: ");
        printRubbishes(harmfulRubbishCriteria.rubbishFilter(rubbishList));

        System.out.println("可回收垃圾: ");
        printRubbishes(recycledRubbishCriteria.rubbishFilter(rubbishList));

        // chainable
        printRubbishes(
                recycledRubbishCriteria.rubbishFilter(
                        harmfulRubbishCriteria.rubbishFilter(
                                wetRubbishCriteria.rubbishFilter(
                                        dryRubbishCriteria.rubbishFilter(rubbishList)
                                )
                        )
                )
        );
    }

    private static void printRubbishes(List<Rubbish> rubbishes) {
        for (Rubbish rubbish: rubbishes) {
            System.out.println(rubbish);
        }
    }
}
