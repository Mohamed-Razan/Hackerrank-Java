// Question: https://www.hackerrank.com/challenges/java-biginteger/problem

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger a, b, sum, mul;
        a = scan.nextBigInteger();
        b = scan.nextBigInteger();
        sum = a.add(b);
        mul = a.multiply(b);
        System.out.print(sum + "\n" + mul);
    }
}
