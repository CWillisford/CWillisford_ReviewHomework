package ReviewQuestions;
/**Class: isLeapYear
 * @author Carson Willisford
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 20, 2023
 *
 * This class, given an integer representing a year, prints 'true' or 'false'
 * depending if that year is a leap year or not
 */
public class IsLeapYear {
    public static void leap(int year) {
        if (year%100==0 && year%400==0)
            System.out.println("true");
        else if (year%4==0)
            System.out.println("true");
        else
            System.out.println("false");
    }
    public static void main(String[] args) {
        leap(1996);
        leap(2000);
        leap(1992);
        leap(2023);
    }
}
