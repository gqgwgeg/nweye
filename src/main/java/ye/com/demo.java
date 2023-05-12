package ye.com;

import java.util.ArrayList;

public class demo {

    public static void main(String[] args) {
       System.out.println("远程库代码");
        System.out.println("三国的武将有哪些");
        ArrayList<String> arr = new ArrayList();
        arr.add("张飞");
        arr.add("张菲");
        arr.add("无敌");
        arr.add("张军");
        arr.add("阿雅");
        arr.add("刘备");
        for (String s : arr) {

            System.out.println("三国武将:"+s);
        }

//测试的东西

    }
}
