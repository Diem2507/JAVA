import java.util.Scanner;
import java.lang.Math;
public class mortgage_calculator{
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        float rate = scanner.nextFloat();
        System.out.print("Period (Years): ");
        int period = scanner.nextInt();
        float mortgage;
        mortgage = (principal*rate*Math.pow(1+rate, (float)period))/(Math.pow(1+rate, period) - 1);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String m = currency.format(mortgage);
        System.out.print("Mortgage: " + m);
        scanner.close();
    }
}