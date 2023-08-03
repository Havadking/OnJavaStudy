package com.havad.streams;

import java.util.stream.*;

/**
 * @program: OnJavaStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-02 10:28
 **/

public class Duplicator {
    public static void main(String[] args) {
        Stream.generate(() -> "duplicate")
                .limit(10)
                .forEach(System.out::println);
    }
}
