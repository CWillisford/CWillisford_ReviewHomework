package ReviewQuestions;
/**Class: countOccurrences
 * @author Carson Willisford
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 20, 2023
 *
 * This class takes two parameters, a string called 'text' and a char called 'tangent'.
 * The method 'countOccurences' counts the number of times the target character in the
 * string appears and then returns that number
 */
public class countOccurrences {
    public static int countOccurences(String text, char target) {
        int count=0;
        for(int i=0; i<text.length(); i++){
            if(text.charAt(i) == target)
                count+=1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countOccurences("The quick brown fox jumps over the lazy dog",'e'));
    }
}