package lesson2.task4;

import java.util.Arrays;

public class TwoStrings {
    public static void main(String[] args) {
        String[] string1 = {"hello", "ping", "qwer", "post"};
        String[] string2 = {"world", "pong", "asdf", "get"};
        String[] result = {"", "", "", ""};

        for (int index = 0; index < string1.length; index++) {
            char[] arrayString1 = string1[index].toCharArray();
            Arrays.sort(arrayString1);
            for (char str : arrayString1) {
                String symbols = String.valueOf(str);
                if (result[index].contains(symbols)) continue;
                if (string2[index].contains(symbols)) result[index] = result[index] + symbols;
            }
            System.out.println(result[index]);
        }
    }
}