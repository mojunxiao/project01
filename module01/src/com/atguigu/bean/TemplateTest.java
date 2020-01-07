package com.atguigu.bean;

import com.atguigu.java.hello;

import java.util.ArrayList;

/**
 * @author mojx
 * @date 2020/1/7- 9:10
 */
public class TemplateTest {
    private static final Customer CUSTOMER = new Customer();
    private static final hello HELLO = new hello();
    //psfi
    public static final int NUM = 1;
    //psfs
    public static final String STR = "STRING";

    //psvm
    public static void main(String[] args) {
        // sout
        System.out.println();
        //模板2//变形 soutm soutv
        int num1 = 10;
        System.out.println("num1 = " + num1);
        int num2 = 20;
        System.out.println("num2 = " + num2);
        //for 循环 fori
        String[] arr = new String[]{"a", "b", "c"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形 iter
        for (String s : arr) {
            System.out.println(s);
        }
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);

        }
        //集合 list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(456);
        for (Object o : list) {
            System.out.println(o);
        }

        //list.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println();
        }

        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list);
        }

    }

    public void mothod() {
        System.out.println("TemplateTest.mothod");
        //ifn
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(456);
        if (list == null) {

        }
        //inn
        if (list != null) {

        }

        //xxx.nn
        if (list != null) {

        }


    }

}










