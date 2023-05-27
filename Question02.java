package project02;

public class Question02 {
    /* Check if a String is Palindrome: Determine whether a given string is a palindrome,
    which means it reads the same forwards and backward. For example, "madam" is a palindrome*/

    boolean palindrome(String word) {
        String rev = "";
        boolean isPalindrome = false;
        for (int i = word.length()-1; i >= 0; i--) {
            rev = rev + word.charAt(i);

        }

        if(word.equals(rev)){
            isPalindrome=true;
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        Question02 q2 = new Question02();
        boolean result= q2.palindrome("mam");
        System.out.println(result);



    }
}