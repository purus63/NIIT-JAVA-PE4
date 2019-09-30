package com.company;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String rs = str.replace("d","f");
        String rs1 = rs.replace("l","t");

        System.out.println(rs1);
    }
}
