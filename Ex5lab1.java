import java.util.Scanner;

public class Ex5lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.print("It\'s leap year!");
        }
        else System.out.print("It\'s not a leap year!");
        sc.close();
    }
}
