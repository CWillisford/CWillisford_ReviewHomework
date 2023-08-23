package ReviewQuestions;
/**Class: StringCharacterPractice
 * @author Carson Willisford
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 18, 2023
 *
 * This class creates a string and prints out the length of the
 * messagge using the "length()" method. Then it creates a string containing
 * my favorite quote and prints the character at the 10th position of the string
 */
public class StringCharacterPractice {
    public static void main(String[] args){
        //1
        String message = "Hello, World";
        System.out.println(message.length());
        //2
        String quote = "Tomorrow's a brand new day, never been used";
        System.out.println(quote.charAt(10));
    }
}
