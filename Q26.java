// Question: https://www.hackerrank.com/challenges/java-1d-array-introduction/problem

import java.util.*;

public class Solution {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int j;
        int a[] = new int[n];
        for(j = 0;j < n; j++){
            a[j] = scan.nextInt();
        }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}