package ReviewQuestions;
/**Class: countVowels
 * @author Carson Willisford
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 20, 2023
 *
 * This class takes in a string and returns the amount of vowels in that string
 */
public class CountVowels {
    public static int countVowels (String s) {
        int count = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
                count+=1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countVowels("hello"));
        System.out.println(countVowels("world"));
        System.out.println(countVowels("aeiou"));
    }
}
