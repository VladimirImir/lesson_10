package com.dev.lesson10;

/**
 * 3. Написать функцию, принимающую в качестве параметров имя, фамилию и
 * отчество и возвращающую инициалы
 * в формате "Ф.И.О". Учесть, что входные параметры могут быть в любом
 * регистре, а результирующая строка должна быть в верхнем.
 */

public class Task3 {

    public static void main(String[] args) {
        String result = format("Vladimir", "Ivanov", "Sidorovich");
        System.out.println(result);
    }

    public static String format(String firstName, String lastName, String patronymicName) {
        /** charAt() - методкоторый возвращает первый символ строки. */

        /** Таким образом привели все символы toUpperCase*/
        /** char firstNameChar = firstName.toUpperCase().charAt(0);
        char lastNameChar = lastName.toUpperCase().charAt(0);
        char patronymicNameChar = patronymicName.toUpperCase().charAt(0);*/

        // return firstNameChar + "." + lastNameChar + "." + patronymicNameChar;

        /** Таким образом привели только один символ toUpperCase*/
        char firstNameChar = Character.toUpperCase(firstName.charAt(0));
        char lastNameChar = Character.toUpperCase(lastName.charAt(0));
        char patronymicNameChar = Character.toUpperCase(patronymicName.charAt(0));

        /** % - мы обозначаем какое то зарезервированное слово. */
        /** s - Строка. */
        return String.format("%s.%s.%s", firstNameChar, lastNameChar, patronymicNameChar);
    }
}
