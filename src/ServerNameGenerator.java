import java.util.Arrays;

public class ServerNameGenerator {
    String[] adjs = {"spicy", "sweet", "tasty", "sharp", "bumpy", "sour", "freezing", "hard", "cool", "slimy", "icy"};
    String[] nouns = {"rex", "john", "edith", "ry", "willie", "janice", "casey", "tracy", "lily", "mary"};
    public static void main(String[] args) {
        System.out.println("Here is your server name: ");
    }
    public String[] randomAdj(String[] adjs){

        for (int i = 0; i <= adjs.length; i++){
            i += adjs.length;
            System.out.println(i);
        }
    }


}
