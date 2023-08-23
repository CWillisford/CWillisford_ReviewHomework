package ReviewQuestions;
/**Class: MyReview
 * @author Carson Willisford
 * @version 1.0
 * Course: ITEC 2150 2023
 * Written: August 18, 2023
 *
 * This class was a practice to find what was wrong with the code that was
 * preventing it from printing the desired results. The issue was that the program
 * was returning the results in ASCII form. To fix it, I had to add quotation marks
 * to the returning value so that the methods would add the letters to a string
 */
//fix this code so the results print this \/
    //reverseDoubleChar("The") → "eehhTT"
    //reverseDoubleChar2("AABB") → "BBBBAAAA"
    //reverseDoubleChar3("String") → "ggnniirrttSS"

    //-=Personal note=-
    //      The problem was that it was returning the char's in
    //  their ASCII form as intergers. It's fixed by adding
    //  quotation marks inside of the for loops to force the char's
    //  to be added to a string that can be printed as the result
    //
    //  The quotation marks added are on lines 29, 37, and 45

public class MyReview {
    public static void main(String[] args){
        System.out.println(reverseDoubleChar("The"));
        System.out.println(reverseDoubleChar2("AABB"));
        System.out.println(reverseDoubleChar3("String"));
    }

    public static String reverseDoubleChar(String word){
        String result = "";
        for(int i = word.length() - 1; i >= 0; i--){
            result = result + ("" + word.charAt(i) + word.charAt(i)) ;
        }
        return result;
    }

    public static String reverseDoubleChar2(String word){
        String result = "";
        for(int i = 0 ; i < word.length() ; i++){
            result = "" + word.charAt(i) + word.charAt(i) + result ;
        }
        return result;
    }

    public static String reverseDoubleChar3(String word){
        String result = "";
        for(int i = word.length() - 1 ; i >= 0 ; i--){
            result += "" + word.charAt(i) + word.charAt(i) ;
        }
        return result;
    }
}
