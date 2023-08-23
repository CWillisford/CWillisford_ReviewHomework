package ReviewQuestions;
/**Class: LoopPractice2
 * @author Carson Willisford
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 18, 2023
 *
 * This class repeatedly asks the user for a number until they
 * enter a negative number and then prints the sum of all the positive
 * numbers entered.
 */
import java.util.Scanner;
public class LoopPractice2 {
    public static void main(String[] args){
        //set up scanner
        Scanner input = new Scanner(System.in);
        boolean positive = true;
        int sum = 0;
        int num = 0;
        //get input
        while (positive){
            System.out.print("Enter a number: ");
            num = input.nextInt();
            if (num > 0)
                sum += num;
            else{
                System.out.println(sum);
                positive = false;
            }
        }
    }
}
