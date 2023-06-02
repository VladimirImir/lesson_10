package com.dev.lesson10;

/**
 * 2. Написать функцию, принимающую 2 параметра: строку и слово - и
 * возвращающую true, если строка начинается и заканчивается этим словом.
 */

public class Task2 {

    public static void main(String[] args) {
        String value = "01 Hello World 01";
        String word = "01";
        System.out.println(isStartAndEnd(value, word));

        String value2 = "01 Hello World 010";
        String word2 = "01";
        System.out.println(isStartAndEnd(value2, word2));
    }

    private static boolean isStartAndEnd(String target, String word) {
        return target.startsWith(word) && target.endsWith(word);
    }
}
