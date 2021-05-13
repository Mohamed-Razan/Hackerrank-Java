// Question: https://www.hackerrank.com/challenges/java-string-reverse/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        int i, j, n, count = 0;
        n = A.length();
        for(i = 0, j = n-1; i < j; i++, j--){
            if(A.charAt(i) != A.charAt(j))
                count = 1;
        }
        if(count == 0)
            System.out.print("Yes");
        else{
            System.out.print("No");
        }
        
    }
}



