package jihe;

import java.util.ArrayList;
import java.util.List;
public class Listdemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add("河池学院");
        list.add(123.123F);
        list.add(false);
        list.add(1);
        System.out.println("当前元素个数："+list.size());
        System.out.println("所有元素如下：");
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
    }

}
