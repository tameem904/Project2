package project02;

import java.util.Arrays;

public class Question04 {
    /*
Check if Two Strings are Anagrams: Given two strings, determine if they are anagrams, meaning they contain
the same characters in a different order. For example, "listen" and "silent" are anagrams.
     */


    public static void main(String[] args) {
        String s1 = "lives";
        String s2 = "devil";
        int count=0;

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        if (c1.length != c2.length) {
            System.out.println("length is not matching");
            System.exit(0);
        }
        Arrays.sort(c1);
        Arrays.sort(c2);
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) {
                System.out.println("Its not an anagram");
                System.exit(0);
            }
            else{
                System.out.println("Its an anagram");
            }
            break;
        }
    }
}