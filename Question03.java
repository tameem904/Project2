package project02;

public class Question03 {
    /*Count the Number of Words in a String: Write a function to count the number of words in a given string.
Words are separated by spaces or punctuation. For example, the input "Hello, world!" should return 2.
     */
    int countString(String word){
        String [] s1 =word.split(" ");
        int count=0;
        for(String s2:s1){
            if(s2!=" " && s2!=","){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Question03 q3 = new Question03();
        int result=q3.countString("Hello my world");
        System.out.println(result);
    }
}
