// Question: https://www.hackerrank.com/challenges/java-list/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int i, n, q, r, m, t, x, j, z;
        String s;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>(20*n);

        for(i = 0; i < n; i++){
            x = scan.nextInt();
            a.add(x);
        }
        for(i = n; i < 20*n; i++){
            a.add(10);
        }
        z = n;
        q = scan.nextInt();
        for(i = 0; i < q; i++){
            scan.nextLine();
            s = scan.nextLine();
            if(s.trim().equals("Insert")){
                r = scan.nextInt();
                m = scan.nextInt();;
                if(r < z){
                    for(j = z-1; j >= r; j--){
                        x = a.get(j);
                        a.set((j+1),x);
                        a.set(j,0);
                    }
                }
                a.set(r, m);
                z++;
            }
            else{
                t = scan.nextInt();
                a.remove(t);
                z--;
            }
        }
        
            for(i = 0; i < z; i++){
                System.out.print(a.get(i)+" ");
            }
        
    }
}

