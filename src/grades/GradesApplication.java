package grades;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Student rex = new Student("Rex");
        rex.addGrade(75);
        rex.addGrade(33);
        rex.addGrade(99);
        Student jack = new Student("Jack");
        jack.addGrade(25);
        jack.addGrade(43);
        jack.addGrade(79);
        Student john = new Student("John");
        john.addGrade(100);
        john.addGrade(99);
        john.addGrade(87);
        Student dave = new Student("Dave");
        dave.addGrade(85);
        dave.addGrade(77);
        dave.addGrade(88);
        HashMap <String, Student> student = new HashMap();
        student.put("Rexnsutton", rex);
        student.put("JackDaniels", jack);
        student.put("JohnDoe", john);
        student.put("DaveSkylark", dave);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Here are the GitHub usernames of our students: ");
        System.out.println(student.keySet());
        System.out.println("What student would you like to see more information on?: ");




    }
}
