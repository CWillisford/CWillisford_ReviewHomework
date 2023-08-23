package ReviewQuestions;
/**Class: ArrayPractice2
 * @author Carson Willisford
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 18, 2023
 *
 * The class finds the maximum value in an array of integers
 */

public class ArrayPractice2 {
    public static void main(String[] args) {
        int[] nums = {10, 5, 25, 20, 15};
        int thisNum = 0;

        for(int i=0; i<nums.length; i ++) {
            if (nums[i] > thisNum)
                thisNum = nums[i];
        }
        System.out.println("The largest number in the array is " + thisNum);
    }
}
