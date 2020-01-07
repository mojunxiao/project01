package com.atguigu.bean;

import java.util.HashMap;

/**
 * @author mojx
 * @date 2020/1/7- 19:59
 */
public class DebugerTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        HashMap<String, String> map = new HashMap<>();
        map.put("name","Tom");
        map.put("age","20");
        map.put("school","havor");
        map.put("major","Chemesrty");

        String age = map.get("age");
        System.out.println("age = " + age);

        map.remove("majar");
        System.out.println(map);
    }
}
