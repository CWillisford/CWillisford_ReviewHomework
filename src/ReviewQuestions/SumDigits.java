package ReviewQuestions;
/**Class: sumDigits
 * @author Carson Willisford
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 20, 2023
 *
 * This class, given a non-negative integer 'n', returns the sum of
 * that integer's digits
 */
public class SumDigits {
    public static int sumDigits(int n) {
        int sum = 0;
        while (n > 10){
            sum += n % 10;
            n = n/10;
        }
        return sum+=n;
    }
    public static void main(String[] args) {
        System.out.println(sumDigits(0));
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(9));
        System.out.println(sumDigits(12));
        System.out.println(sumDigits(123));

    }
}
