package javaClasses;

import java.util.Scanner;

public class Detyra1 {

    public static void main(String[] args) {
        System.out.println(getFirstAndLastCharacter("Cacttus"));
    }


    public static String getFirstAndLastCharacter(String value) {
        String firstCharacter = String.valueOf(value.charAt(0));
        String lastCharacter = String.valueOf(value.charAt(value.length()- 1));
        return firstCharacter + lastCharacter;

    }


}
