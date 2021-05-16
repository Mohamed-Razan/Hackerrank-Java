// Question: https://www.hackerrank.com/challenges/java-bitset/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int m =in.nextInt();
        BitSet bs1 = new BitSet(n);
         BitSet bs2 = new BitSet(n);
  
        for(int i=0;i<m;i++)
            {
                 String op = in.next();
                 int s1= in.nextInt();
                int s2 =in.nextInt();
            if(op.equals("AND") || op.equals("OR")|| op.equals("XOR"))
            {    
                 if(s1 == 1)
                {
                   switch(op){
                    case "AND" : bs1.and(bs2); break;
                    case "OR"  : bs1.or(bs2);break;
                    case "XOR"  : bs1.xor(bs2); break;
                    }
            }
                else if(s1 == 2)
                {
                    switch(op) {
                    case "AND" : bs2.and(bs1);break;
                    case "OR"  : bs2.or(bs1);break;
                    case "XOR"  : bs2.xor(bs1);break; }
                }   
            }
            if(op.equals("SET") || op.equals("FLIP"))
                {
                if(s1==1)
                    {
                    switch(op) {
                        case "SET" : bs1.set(s2);break;
                        case "FLIP" : bs1.flip(s2);break;
                    }
                }
                    else if(s1 == 2)
                        {
                        switch(op) {
                        case "SET" : bs2.set(s2);break;
                        case "FLIP" : bs2.flip(s2);break;
                    }
                    }
                }
             System.out.println(bs1.cardinality()+" "+bs2.cardinality());
            
            }
            
           
          
        }
    }
