package com.havad.streams;

import java.util.stream.Stream;

/**
 * @program: OnJavaStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-03 15:19
 **/

public class FunctionMap2 {
    public static void main(String[] args) {
        Stream.of(1, 3, 5, 7, 9, 11, 13)
                .map(Numbered::new)
                .forEach(System.out::println);
    }
}

class Numbered {
    final int n;
    Numbered(int n){
        this.n = n;
    }

    @Override
    public String toString() {
        return "Numbered{" +
                "n=" + n +
                '}';
    }
}
