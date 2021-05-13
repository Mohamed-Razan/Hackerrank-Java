// Question: https://www.hackerrank.com/challenges/java-currency-formatter/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
         String moneyString = formatter.format(payment);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + moneyString);
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
