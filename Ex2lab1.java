import java.util.Scanner;

public class Ex2lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Height: ");
        float height = sc.nextFloat();
        System.out.print("Base: ");
        float base = sc.nextFloat();
        float area = (1.0f/2)*height*base;
        System.out.println("Area: " + area);
        sc.close();
    }
}
