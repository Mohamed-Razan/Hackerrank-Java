// Question: https://www.hackerrank.com/challenges/java-bigdecimal/problem

import java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        BigDecimal a[] = new BigDecimal[n];
        int j, k;
        BigDecimal temp;
        String temp2;

        for(j = 0; j < n; j++){
            a[j] = new BigDecimal(s[j]);
        }

        for(j = 0; j < n-1; j++){
            for(k = j; k < n; k++){
                if(a[j].compareTo(a[k]) < 0){
                    temp = a[j];
                    a[j] = a[k];
                    a[k] = temp;
                    temp2 = s[j];
                    s[j] = s[k];
                    s[k] = temp2;
                }
            }
        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}