package ReviewQuestions;
/**Class: MethodPractice
 * @author Carson Willisford
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 18, 2023
 *
 * This class uses two methods, one called 'calculateSquare' to take an integer and returns that
 * number's square and another called 'printName' which given a name as a string, prints "Hello, [name]!"
 */
//this is 1 AND 2 for "Methods"
public class MethodPractice {
    public static int calculateSquare(int num) {
        int square = num*num;
        return square;
    }
    public static void printName(String name){
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args){
        System.out.println("2^2 =  " + calculateSquare(2));
        printName("Carson");
    }
}
