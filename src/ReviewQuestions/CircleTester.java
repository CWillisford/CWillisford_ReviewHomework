package ReviewQuestions;
/**Class: CircleTester
 * @author Carson Willisford
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 20, 2023
 *
 * This class creates an object called 'shape' and uses the 'calculateArea()'
 * method to find the area of a circle using it's radius
 */
public class CircleTester {
    public static void main(String[] args) {
        Circle shape = new Circle(3.4);
        System.out.println(shape.calculateArea());
    }
}
