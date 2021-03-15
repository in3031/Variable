package ru.dd.in3031.first;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Variable {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String cnt = sc.next();
        Pattern pattern=Pattern.compile(cnt);
        System.out.println(cnt);
    }
}