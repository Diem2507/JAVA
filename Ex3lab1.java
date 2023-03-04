import java.util.Scanner;

public class Ex3lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Second number: ");
        int secondNumber = sc.nextInt();
        int remainder = firstNumber % secondNumber;
        System.out.println("Remainder: " + remainder);
        sc.close();
    }
}
