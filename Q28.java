// Question: https://www.hackerrank.com/challenges/java-negative-subarray/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int n, i, j, sum = 0, count = 0, k;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int a[] = new int[n];
        for(j = 0;j < n; j++){
            a[j] = scan.nextInt();
        }
        scan.close();

        for(i = 0; i < n; i++){
            for(j = 0; j < n-i; j++){
                for(k = j; k <= i+j; k++){
                    sum = sum + a[k];
                }
                if(sum < 0){
                    count++;
                }
                sum = 0;
            }
        }
        System.out.print(count);
    }
}
