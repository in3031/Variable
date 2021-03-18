package ru.dd.in3031.first;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Variable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cnt = sc.next();


        char[] strToArray = cnt.toCharArray();
        for (int i = 0; i < strToArray.length; i++) {
            strToArray.equals(cnt);
            System.out.print(cnt);
        }

//        Pattern pattern = Pattern.compile("t(.)");
//        Matcher matcher = pattern.matcher(cnt);
//        while (matcher.find()) {
//            System.out.println(matcher.group());
//        }
    }
}