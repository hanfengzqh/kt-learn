package com.zqh.kt;

import java.util.ArrayList;

public class Test {
    static int i = 1;

    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList();
//        for (int i =0;i<10;i++){
//            list.add("数字"+i);
//        }
//        System.out.println(list.get(5));
//        System.out.println("-------------------------");
//        list.add(5,"abscess");
//
//        System.out.println(list.size()+"=========="+list.get(5));
//        Single single = Single.Companion.get();
        System.out.println(getIValue());
        System.out.println(i);

        int a = 0;
        for (int i = 0; i < 10; i++) {
//            a =(a=a+1);
            a = a++;
        }
        System.out.println(a);

    }

    private static int getIValue() {
        try {
            i++;
            return i;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            i++;
        }
        return i;
    }
}
