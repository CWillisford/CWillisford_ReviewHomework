package ReviewQuestions;
/**Class: LoopPractice1
 * @author Carson Willisford
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 18, 2023
 *
 * This class uses a 'for' loop to print event numbers
 * from 2 to 10
 */
public class LoopPractice1 {
    public static void main(String[] args){
        for(int i=2;i<11;i++){
            if (i%2==0) {
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }
}
