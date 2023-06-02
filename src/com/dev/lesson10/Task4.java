package com.dev.lesson10;

/**
 * 4. Подсчитать количество всех точек, запятых и восклицательных знаков в
 * строке.
 */

public class Task4 {

    public static void main(String[] args) {
        String value = "Hello World.,!Hello World.,?Hello World!....Hello World";
        System.out.println(countSymbols(value));
    }

    public static int countSymbols(String value) {
        String result = value
                .replace(".", "")
                .replace(",", "")
                .replace("!", "");
        return value.length() - result.length();
        /** length() - возвращает кол-во символов строки. */
    }
}
