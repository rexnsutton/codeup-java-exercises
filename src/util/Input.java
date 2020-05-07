package util;
import java.util.Scanner;

public class Input {
    private static Scanner scan = new Scanner(System.in);
//    String getString(){
//
//
//    }
    public static boolean yesNo(){
    String input = scan.nextLine();
    if(input.toLowerCase().charAt(0) == 'y'){
    return true;
    } else {
        return false;
    }

    }
   public static void getInt(int min, int max){
        while(true) {
            System.out.println("give me an int: ");
            int userInput = scan.nextInt();
            if (userInput >= min && userInput <= max){
                break;
            }
            else if(userInput < min || userInput > max){

            }
        }
    }
//    int getInt(){
//
//    }
//    double getDouble(double min, double max){
//
//    }
//    double getDouble(){
//
//    }
    public static void main(String[] args) {
        System.out.println(yesNo());
        getInt(1, 10);

    }
}
