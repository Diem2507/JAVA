import java.util.Scanner;

public class Ex1lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Date of birth: ");
        String dateOfBirth = sc.nextLine();
        System.out.print("ID: ");
        String iD = sc.nextLine();
        System.out.print('\n');
        System.out.println("Your Name: " + name);
        System.out.println("Your Date of birth: " + dateOfBirth);
        System.out.println("Your ID: " + iD);
        sc.close();
    }
}