package com.example.myapplication;
import java.util.Scanner;

public class tt {
    public static void main(String a[]){
        int l;
        String c,d,temp;
        String s = "23 Hello world ABCDEFGH";
        Scanner scanner = new Scanner(s);
           while(scanner.hasNextLine()){

           l=Integer.parseInt(scanner.next());
            c= scanner.next();
            d= scanner.next();
            temp= scanner.next();
            System.out.println((l+1)+" "+c+" "+d+" "+temp);

        }
    }}
