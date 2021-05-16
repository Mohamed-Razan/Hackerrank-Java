// Question: https://www.hackerrank.com/challenges/pattern-syntax-checker/problem

import java.util.*;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        int i;
		int testCases = Integer.parseInt(in.nextLine());
		for(i = 0; i < testCases; i++){
			String pattern = in.nextLine();
          	try{
                  Pattern.compile(pattern);
                  System.out.println("Valid");
              }
              catch(Exception e){
                  System.out.println("Invalid");
              }
              }
              testCases--;
		}
}



