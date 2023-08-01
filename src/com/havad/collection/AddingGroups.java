package com.havad.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * @program: OnJavaStudy
 * @description: add groups to Collection
 * @author: Havad
 * @create: 2023-07-24 15:47
 **/

public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Integer[] moreInts = {6, 7, 8, 9, 10};
        System.out.println(collection);
        collection.addAll(Arrays.asList(moreInts));
        System.out.println(collection);
    }
}


