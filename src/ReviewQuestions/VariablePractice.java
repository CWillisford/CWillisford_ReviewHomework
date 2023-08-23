package ReviewQuestions;
/**Class: VariablePractice
 * @author Carson Willisford
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 18, 2023
 *
 *     This program declares a variable named "temperature" and assigns
 * it a value of 25 and then prints out the temperature using "System.out.println()"
 *     Next, it creates two variables named "firstName" and "lastName" that store
 * my first and last name, then it combines them to form my full name and prints it.
 */
public class VariablePractice {
    public static void main(String[] args){
        //1
        int temperature = 25;
        System.out.println(temperature);
        //2
        String firstName = "Carson";
        String lastName = "Willisford";
        System.out.println(firstName + " " + lastName);
    }
}
