// Question: https://www.hackerrank.com/challenges/java-string-tokens/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        int i, l, count = 0, sum = 0;
        l = s.length();
        for(i = 0; i < l; i++){
            if(((s.charAt(i) >= 'A')&&(s.charAt(i) <= 'Z'))||((s.charAt(i) >= 'a')&&(s.charAt(i) <= 'z'))){
                if(count == 0){
                    sum++;
                }
                count = 1;
            }
            else{
                count = 0;
            }
        }
        count = 0;
        System.out.println(sum);
        for(i = 0; i < l; i++){
            if(((s.charAt(i) >= 'A')&&(s.charAt(i) <= 'Z'))||((s.charAt(i) >= 'a')&&(s.charAt(i) <= 'z'))){
                count = 1;
                System.out.print(s.charAt(i));
            }
            else{
                if(count == 1){
                    System.out.print("\n");
                }
                count = 0;
            }
        }
        scan.close();
    }
}

