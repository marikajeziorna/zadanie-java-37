import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Give last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Give pesel: ");
        String pesel = scanner.nextLine();
        System.out.println("Give age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        Person person = new Person(firstName, lastName, pesel, age);
        System.out.println(person);
    }
}


