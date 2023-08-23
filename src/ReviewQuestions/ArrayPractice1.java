package ReviewQuestions;
/**Class: ArrayPractice1
 * @author Carson Willisford
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 18, 2023
 *
 * This class declares an array of integers with values 5, 10, 15, 20, 25, then
 * calculates and prints the sum of all of the elements
 */

public class ArrayPractice1 {
    public static void main(String[] args){
        int[] nums = {5, 10, 15, 20, 25};
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        System.out.println("The sum is " + sum + "!");
    }
}
