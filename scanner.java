import java.util.Scanner;

public class scanner{
    public static void main(String[] args) {
        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Input an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Input a float
        System.out.print("Enter a float: ");
        float decimal = scanner.nextFloat();

        // Input a string (word)
        System.out.print("Enter a word: ");
        String word = scanner.next();

        // Input a full line
        scanner.nextLine(); // consume the leftover newline
        System.out.print("Enter a full line: ");
        String line = scanner.nextLine();

        // Display input
        System.out.println("\nYou entered:");
        System.out.println("Integer: " + number);
        System.out.println("Float: " + decimal);
        System.out.println("Word: " + word);
        System.out.println("Line: " + line);

        scanner.close();
    }
}
