import java.util.Scanner;
public class Bob {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something: ");
        String userInput = scanner.nextLine();
        System.out.println("You entered: " + userInput);
        if (userInput.endsWith("?")){
            System.out.println("Sure");
        } else if (userInput.endsWith("!")){
            System.out.println("Whoa, Chill Out");
        } else if (userInput.equalsIgnoreCase("")){
            System.out.println("Fine. Be that way.");
        } else {
            System.out.println("Whatever");
        }









    }
}
