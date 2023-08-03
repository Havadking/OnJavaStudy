package com.havad.streams;

import java.util.stream.Stream;

/**
 * @program: OnJavaStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-03 15:38
 **/

public class StreamOfStreams {
    public static void main(String[] args) {
        Stream.of(1, 2, 3)
                .map(integer -> Stream.of("Gonzo", "Kermit", "Beaker"))
                .map(e -> e.getClass().getName())
                .forEach(System.out::println);
    }
}
