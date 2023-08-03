package com.havad.streams;

import java.util.Comparator;

/**
 * @program: OnJavaStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-03 14:40
 **/

public class SortedComparator {
    public static void main(String[] args) throws Exception {
        FileToWords.stream("src/com/havad/streams/Cheese.dat")
                .skip(10)
                .limit(10)
                .sorted(Comparator.reverseOrder())
                .map(s -> s + " ")
                .forEach(System.out::print);
    }
}
