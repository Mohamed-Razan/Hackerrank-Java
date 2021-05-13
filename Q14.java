// Question: https://www.hackerrank.com/challenges/java-strings-introduction/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String B=sc.nextLine();
        /* Enter your code here. Print output to STDOUT. */
        int a, b;
        a = A.length();
        b = B.length();
        System.out.println(a+b);
        if(A.compareTo(B) > 0)
            System.out.println("Yes");
        else
            System.out.println("No");
        
        String s1 = A.substring(0,1);
        String s2 = s1.toUpperCase();

        String t1 = B.substring(0,1);
        String t2 = t1.toUpperCase();

        System.out.print(s2+A.substring(1,a)+" "+t2+B.substring(1,b));
    }
}



