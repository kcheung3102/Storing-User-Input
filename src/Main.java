import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter first initial, last name, and address");

        String firstInitial = keyboard.next();
        String lastName = keyboard.next();
        int houseNumber = keyboard.nextInt();
        String streetName = keyboard.next();
        String streetType = keyboard.next();
        String city = keyboard.next();


        System.out.println(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);
    }
}
