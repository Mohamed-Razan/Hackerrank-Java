// Question: https://www.hackerrank.com/challenges/java-2d-array/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        int i, j, k, l, sum = 0, max = -1000;
        for (i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();

        for(i = 0; i < 4; i++){
            for(j = 0; j < 4; j++){
                for(k = i; k < i+3; k++){
                    for(l = j; l < j+3; l++){
                        if(((k == i+1)&&(l == j))||((k == i+1)&&(l == j+2)))
                            continue;
                        sum = sum + arr[k][l];
                    }
                }
                if(sum > max)
                    max = sum;   
                sum = 0;
            }
        }
        System.out.print(max);
    }
}
