package jihe;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(1);
        set.add("河池学院");
        set.add(123.123);
        set.add(false);
        set.add(1);
        System.out.println("当前元素个数："+set.size());
        Iterator it = set.iterator();
        while(it.hasNext()) {
            System.out.println("元素是："+it.next());
        }
    }
}
