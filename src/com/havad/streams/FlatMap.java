package com.havad.streams;

import java.util.stream.Stream;

/**
 * @program: OnJavaStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-03 15:51
 **/

public class FlatMap {
    public static void main(String[] args) {
        Stream.of(1, 2, 3)
                .flatMap(
                        integer -> Stream.of("Gonzo", "Fozzie", "Beacker")
                )
                .forEach(System.out::println);
    }
}
