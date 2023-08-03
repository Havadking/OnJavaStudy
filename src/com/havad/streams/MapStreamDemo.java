package com.havad.streams;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: OnJavaStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-02 09:44
 **/

public class MapStreamDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("周杰伦");
        list.add("王力宏");
        list.add("陶喆");
        list.add("林俊杰");

        list.stream().map(String::length)
                .forEach(System.out::println);
    }
}
