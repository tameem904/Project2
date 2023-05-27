package project02;

public class Question01 {
    /*Reverse a String: Write a function to reverse a given string.
For example, given the input "Hello", the output should be "olleH"*/


    static String reverseString(String word){
        String rev="";
        for(int i = word.length()-1; i>=0; i--){
            rev=rev+word.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        String word="hello";
        String result = Question01.reverseString(word);
        System.out.println(result);
    }
}