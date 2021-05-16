// Question: https://www.hackerrank.com/challenges/java-stack/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Solution{
    
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int l, i, j, k, count = 0, m;
        char c1[] = new char[100];
        
        while (sc.hasNext()) {
            String s=sc.next();
            l = s.length();
            for(m = 0; m < l; m++) {
                c1[m] = s.charAt(m);
            }
            for(i = 0; i < l; i++){
                switch(c1[i]) {
                case '{':
                    for(j = i; j < l; j++) {
                        if(c1[j] == '}') {
                            c1[i] = c1[j] = 'x';
                            break;
                        }
                    }
                    break;
                case '[':
                    for(j = i; j < l; j++) {
                        if(c1[j] == ']') {
                            c1[i] = c1[j] = 'x';
                            break;
                        }
                    }
                    break;
                case '(':
                    for(j = i; j < l; j++) {
                        if(c1[j] == ')') {
                            c1[i] = c1[j] = 'x';
                            break;
                        }
                    }
                    break;
                }
            }
            for(k = 0; k < l; k++) {
                if(c1[k] != 'x') {
                    count = 1;
                }
            }
            if(count == 0) {
                System.out.println("true");
            }
            else if(count == 1){
                System.out.println("false");
            }
            count = 0;
        }
        
    }
}
