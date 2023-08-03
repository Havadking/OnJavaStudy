package com.havad.lambda;

/**
 * @program: OnJavaStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-03 09:58
 **/

public class ThreadLambda {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Thread Lambda")).start();
    }
}
