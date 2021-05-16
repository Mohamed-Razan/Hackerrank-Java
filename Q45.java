// Question: https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) { 
        func();
    }
    static void func(){
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        try{
            a = scan.nextInt();
            b = scan.nextInt();
            c = a/b;
            System.out.println(c);
        }catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }catch(ArithmeticException e){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}
