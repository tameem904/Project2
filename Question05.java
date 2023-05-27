package project02;

public class Question05 {
    /*Find the First Non-Repeating Character in a String: Given a string, find and return the first
non-repeating character. For example, in the string "abracadabra", the first non-repeating character is 'c'.*/

    public static void main(String[] args) {
        String word = "abracadabra";

       for(int i=0; i<word.length();i++){
           boolean unique = true;
           for (int j = 0; j < word.length(); j++) {
               if(i!=j && word.charAt(i)==word.charAt(j)){
                   unique=false;
                   break;
               }
           }if(unique){
               System.out.println(word.charAt(i));
               break;
           }
       }
    }
}