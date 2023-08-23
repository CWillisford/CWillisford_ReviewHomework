package ReviewQuestions;
/**Class: factorial
 * @author Carson Willisford
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 20, 2023
 *
 * This class, given an integer, prints the factorial of that number
 */
// Personal note: This one was confusing initially. When resulting numbers
// were really big, the program would give the wrong answer. This was because
// the numbers became too big for the INT data type to hold them. The solution
// was to change the returning value to a LONG data type, which could hold a number
// with more digits
public class factorial {
    public static long factorial(int number){
        long fact = number;
        for(int i=number;i>1;i--) {
            fact *=(i-1);
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(9));
        System.out.println(factorial(20));
    }
}
