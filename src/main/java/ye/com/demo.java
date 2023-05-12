package ye.com;

import java.util.ArrayList;

public class demo {

    public static void main(String[] args) {
        System.out.println("三国武将有哪些:"  );
        ArrayList<String> arr = new ArrayList();
        arr.add("张飞");
        arr.add("关羽");
        arr.add("赵黎龙");
        arr.add("徐庶");
        arr.add("曹孟德");
        arr.add("刘备");
        //遍历武将集合
        for (String s : arr) {

            System.out.println("三国武将:"+s);
        }



    }
}
