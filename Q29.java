// Question: https://www.hackerrank.com/challenges/java-arraylist/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, i, q, x, m, r, s, j, k;
        n = scan.nextInt();
        ArrayList<Integer> a[] = new ArrayList[n];
        int b[] = new int[n];

        for(i = 0; i < n; i++){
            a[i] = new ArrayList<Integer>();
        }

        for(i = 0; i < n; i++){
            q = scan.nextInt();
            for(j = 0; j < q; j++){
                x = scan.nextInt();
                a[i].add(x);
            }
            b[i] = j;
        }
        
        m = scan.nextInt();
        for(k = 0; k < m; k++){
            r = scan.nextInt();
            s = scan.nextInt();
            if((r <= n)&&(s <= b[r-1]))
                System.out.println(a[r-1].get(s-1));
            else
                System.out.println("ERROR!");
        }
    }
}
