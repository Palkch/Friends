import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        
        System.out.println("You entered: " + word);
    }
}
