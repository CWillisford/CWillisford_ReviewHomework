package ReviewQuestions;
/**Class: StudentTester
 * @author Carson Willisford
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 20, 2023
 *
 * This class creates three students, each given the own name and age and prints
 * the names of the students that are older than 20
 */
public class StudentTester {
    public static void main(String[] args) {
        //students
        Student s1 = new Student("Jessie", 21);
        Student s2 = new Student("James", 25);
        Student s3 = new Student("Gary", 19);

        Student[] group = new Student[3];
        group[0] = s1;
        group[1] = s2;
        group[2] = s3;

        System.out.print("Students who are older than 20: ");
        for (int i=0; i<group.length; i++) {
            if (group[i].getAge() > 20)
                System.out.print(group[i].getName()+ " ");
        }
    }
}
