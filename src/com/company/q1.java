package com.company;

import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1=sc.nextLine();
        System.out.println("Length Of String:" + str.length());
        System.out.println("Length Of String Without the input character :" + str.replace(String.valueOf(str1.charAt(0)), "").length());
        int charcount = str.length() - str.replaceAll(String.valueOf(str1.charAt(0)), "").length();
        System.out.println("Occurrence Of A Char In String: " + charcount);

    }
}
