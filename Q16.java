// Question: https://www.hackerrank.com/challenges/java-string-compare/problem

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        int l ,i, x, n;
        l = s.length();
        n = l - k + 1;
        String a[] = new String[n];
        for(i = 0; i < n; i++){
            x = i+k;
            a[i] = s.substring(i,x);
        }
        largest = a[0];
        smallest = a[0];
        for(i = 0; i < n; i++){
            if(a[i].compareTo(largest) > 0){
                largest = a[i];
            }
            if(a[i].compareTo(smallest) < 0){
                smallest = a[i];
            }
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}