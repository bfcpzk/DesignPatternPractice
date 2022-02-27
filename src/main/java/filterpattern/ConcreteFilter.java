package filterpattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteFilter {
}

// 干垃圾
class DryRubbishCriteria implements Criteria {
    @Override
    public List<Rubbish> rubbishFilter(List<Rubbish> rubbishes) {
        List<Rubbish> rubbishList = new ArrayList<>();
        for (Rubbish rubbish: rubbishes) {
            // 这里只过滤出所有干垃圾
            if (rubbish.isDry()) {
                rubbishList.add(rubbish);
            }
        }
        return rubbishList;
    }
}

// 有害垃圾
class HarmfulRubbishCriteria implements Criteria{
    @Override
    public List<Rubbish> rubbishFilter(List<Rubbish> rubbishes) {
        List<Rubbish> rubbishList = new ArrayList<>();
        for (Rubbish rubbish: rubbishes) {
            // 这里只过滤出所有有害垃圾
            if (rubbish.isHarm()) {
                rubbishList.add(rubbish);
            }
        }
        return rubbishList;
    }
}

// 可回收垃圾
class RecycledRubbishCriteria implements Criteria{
    @Override
    public List<Rubbish> rubbishFilter(List<Rubbish> rubbishes) {
        List<Rubbish> rubbishList = new ArrayList<>();
        for (Rubbish rubbish: rubbishes) {
            // 这里只过滤出所有可回收垃圾
            if (rubbish.isRecycled()) {
                rubbishList.add(rubbish);
            }
        }
        return rubbishList;
    }
}

// 湿垃圾
class WetRubbishCriteria implements Criteria{
    @Override
    public List<Rubbish> rubbishFilter(List<Rubbish> rubbishes) {
        List<Rubbish> rubbishList = new ArrayList<>();
        for (Rubbish rubbish: rubbishes) {
            // 这里只过滤出所有湿垃圾
            if (rubbish.isWet()) {
                rubbishList.add(rubbish);
            }
        }
        return rubbishList;
    }
}