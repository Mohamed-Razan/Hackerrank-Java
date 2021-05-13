// Question:https://www.hackerrank.com/challenges/java-anagrams/problem

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        String s, t;
        int i, count = 0;
        char c, d;
        s = a.toUpperCase();
        t = b.toUpperCase();
        int m[] = new int[26];
        int n[] = new int[26];
        for(i = 0; i < 26; i++){
            m[i] = 0;
            n[i] = 0;
        }
        for(i = 0; i < s.length(); i++){
            c = s.charAt(i);
            m[c-65]++;   
        }
        for(i = 0; i < t.length(); i++){
            d = t.charAt(i);
            n[d-65]++;   
        }
        for(i = 0; i < 26; i++){
            if(m[i] != n[i])
                count = 1;
        }
        if(count == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}