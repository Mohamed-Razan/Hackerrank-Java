// Question: https://www.hackerrank.com/challenges/java-loops/problem

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int q=in.nextInt();
        int i, j, k, sum, x = 1;
        for(i=0;i<q;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            sum = a;
            for(j = 0; j < n; j++){
                for(k = 0; k < j; k++){
                    x = x*2;
                }
                sum = sum + x*b;
                System.out.print(sum+" ");
                x = 1;
            }
            System.out.print("\n");
        }
        in.close();
    }
}
