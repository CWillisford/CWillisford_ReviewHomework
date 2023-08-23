package ReviewQuestions;
/**Class: Circle
 * @author Carson Willisford
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 20, 2023
 *
 * This class defines an object called 'Circle' with a field called 'radius'
 * It also has a method called 'calculateArea' that calculates the area of a
 * circle given it's radius
 */

public class Circle {
    private double radius;
    //constructor
    public Circle (double radius) {
        this.radius=radius;
    }
    //getters
    public double getRadius() {
        return this.radius;
    }
    //setters
    public void  setRadius() {
        this.radius=radius;
    }
    //methods
    public String calculateArea() {
        return "The area of this circle is " + (3.14 * (this.radius * this.radius));
    }
}
