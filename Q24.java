// Question: https://www.hackerrank.com/challenges/java-primality-test/problem

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
        String n = scanner.nextLine();
        BigInteger d = new BigInteger(n);
        if(d.isProbablePrime(1)){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
        /*String n = scanner.nextLine();

        BigInteger d = new BigInteger(n);
        BigInteger p;
        int x = 2, y = -1;
        BigInteger i = BigInteger.valueOf(x);
        BigInteger m = BigInteger.valueOf(y);
        int count = 0;
        if(d.compareTo(BigInteger.ONE) == 0){
            System.out.print("not prime");
        }
        else{
            while(i.compareTo(d) < 0){
                p = d.remainder(i);
                if((p.compareTo(BigInteger.ONE) == 1)||(p.compareTo(BigInteger.ONE) == 0)||(p.compareTo(m) == -1)||(p.compareTo(m) == -1)){
                    i = i.add(BigInteger.ONE);
                    continue;
                }
                else{
                    count = 1;
                    break;
                }
            }
            if(count == 0)
                System.out.print("prime");
            else
                System.out.print("not prime");
        }*/
    }
}
