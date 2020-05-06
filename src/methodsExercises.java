import java.util.Scanner;

public class methodsExercises {
    public static void main(String[] args){
        System.out.println(2 == sum(1,1));
        System.out.println(4 == subtraction(6,2));
        System.out.println(10 == multiplication(5,2));
        System.out.println(5 == Division (10,2));
        System.out.println(2 == modulus(5,2));
        getInteger(1,10);
    }

    public static double sum (double arg1, double arg2){
        return arg1 + arg2;
    }
    public static double subtraction (double arg1, double arg2){
    return arg1 - arg2;
    }
    public static double multiplication (double arg1, double arg2){
    return arg1 * arg2;
    }
    public static double Division (double arg1, double arg2){
    return arg1 / arg2;
    }
    public static double modulus (double arg1, double arg2){
    return arg1 % arg2;
    }

    public static int getInteger(int min, int max){


           Scanner scan = new Scanner(System.in);
           System.out.print("Enter a number between 1 and 10: ");

           int userInput = Integer.parseInt(scan.nextLine());
           if (userInput < min ||userInput > max ){
        System.out.println("This number is not in range");
        return getInteger(min, max);
       } else{
               System.out.println("Number is within range");
               return userInput;
           }

    }

}
