package com.fasttrack;

import java.util.Random;

public class Homework6 {
    public static void main(String[] args) {
        int target = 10000;
        Random random = new Random();
        int i = random.nextInt();
        System.out.println(i);

        System.out.println(Math.abs(-100));

        if (i > target / 2) {
            System.out.println("larger than half");
        }

        int aRandomInt = random.nextInt();

        extrMethod(target, random, i);
    }

    private static void extrMethod(int target, Random random, int i) {
        while (i < target / 3) {
            i = random.nextInt(target);
            System.out.println(i);
        }
    }
}
