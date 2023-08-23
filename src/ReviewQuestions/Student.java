package ReviewQuestions;
/**Class: Student
 * @author Carson Willisford
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 20, 2023
 *
 * This class creates an object called 'Student' with fields 'name' and 'age'
 */
public class Student {
    private String name;
    private int age;

    //constuctor
    public Student(String name, int age) {
        this.name=name;
        this.age=age;
    }

    //getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    //setters
    public void setName(String name) {
        this.name=name;
    }
    public void setAge(int age) {
        this.age=age;
    }
}
