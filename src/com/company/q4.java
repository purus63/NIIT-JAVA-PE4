package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class q4 {

    public static void reverseString(String str){
        String[] arr=str.split(" +");
        int len=arr.length;
        for(int i=0;i<len;i++){
        StringBuilder sb=new StringBuilder(arr[i]);
        System.out.print(sb.reverse()+" ");
        }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
       reverseString(str1);
    }
}
