package ru.dd.in3031.first;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Variable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cnt = sc.next();
        char[] strToArray = cnt.toCharArray();
        Set<Object> mass2 = new HashSet<>();
        int kolvo = 0;
        for (int i = 0; i < strToArray.length; i++) {
            for (int j = i + 1; j < strToArray.length; j++) {
                if (strToArray[i] == strToArray[j]) {
                    mass2.add(strToArray[j]);
                    kolvo++;
                }
            }
        }

    }
}