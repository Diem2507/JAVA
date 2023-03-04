import java.util.Scanner;

public class Ex6lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int min = sc.nextInt();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (min > num1) {
            min = num1;
        }
        if (min > num2) {
            min = num2;
        }
        System.out.println("The minimum number is: " + min);
        sc.close();
    }
}
