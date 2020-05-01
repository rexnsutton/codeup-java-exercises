import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f\n", pi);
//        System.out.println("give me a number: ");
//        int userNumber = input.nextInt();
//        System.out.println("userNumber = " + userNumber);
//
//        String param1 = input.next();
//        String param2 = input.next();
//        String param3 = input.next();
//
//        System.out.println("param1 = " + param1);
//        System.out.println("param2 = " + param2);
//        System.out.println("param3 = " + param3);
//
        System.out.println("How are you feeling?");
        String sentence = input.nextLine();
        System.out.println("sentence = " + sentence);

        System.out.println("Give me a width: ");
        float width = Float.parseFloat(input.nextLine());
        System.out.println("Give me a length: ");
        float length = Float.parseFloat(input.nextLine());
        float area = width * length;
        float perimeter = (width * 2) + (length * 2 );
        System.out.println("Perimeter : " + perimeter);
        System.out.println("area : " + area);

    }
}
