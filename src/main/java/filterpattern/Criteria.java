package filterpattern;

import java.util.List;

public interface Criteria {
    // 定义过滤的标准
    List<Rubbish> rubbishFilter(List<Rubbish> rubbishes);
}
