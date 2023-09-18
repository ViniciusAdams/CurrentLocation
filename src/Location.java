import java.util.Scanner;

public class Location {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your current location: ");
        String location = scanner.nextLine();

        System.out.println("Your current location is: " + location);
    }
}
