// Question: https://www.hackerrank.com/challenges/java-datatypes/problem

import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-pow(7) && x<=pow(7)-1)
                    System.out.println("* byte");
                if(x>=-pow(15) && x<=pow(15)-1)
                    System.out.println("* short");
                if(x>=-pow(31) && x<=pow(31)-1)
                    System.out.println("* int");
                if(x>=-pow(63) && x<=pow(63)-1)
                    System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
    public static long pow(int n){
        int i; 
        long mul = 1;
        for(i = 0; i < n; i++){
            mul = mul*2;
        }
        return mul;
    }
}



