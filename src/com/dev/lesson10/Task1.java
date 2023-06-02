package com.dev.lesson10;

/** 1. Заменить все грустные смайлы :( в строке на весёлые :) */

public class Task1 {

    public static void main(String[] args) {
        String value = "Sad smile :( Sad smile :( Cheerful smile :) Cheerful smile :) Sad smile :( ";

        /** Ctrl + Alt + V - Создание переменной. */
        String result = replace(value);
        System.out.println(result);
    }

    /** main функция - статическая. Статическая функция может вызывать только другие статические функции. */
    /** Или функции относящиеся к объекту. */

    public static String replace(String value) {

        /** Ctrl + Alt + N - Убрать локальную переменную (inline). */
        return value.replace(":(", ":)");
    }
}
