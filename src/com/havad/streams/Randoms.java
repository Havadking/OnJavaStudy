package com.havad.streams;

import java.util.Random;

/**
 * @program: OnJavaStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-01 17:04
 **/

public class Randoms {
    public static void main(String[] args) {
        new Random(47)
                .ints(5, 20)
                .distinct()
                .limit(7)
                .sorted()
                .forEach(System.out::println);

    }
}
