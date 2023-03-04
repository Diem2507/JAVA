import java.util.Scanner;

public class IncreaseOrDecrease {
    

public class Statement {
    public static boolean isIncreasing(int a, int b, int c) {
    return a <= b ? b <= c   : b >= c&& c>a;
    }
    public static boolean isDecreasing(int d, int e, int f) {
    return d >= e  ? e >= f: e <= f && f<d;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
        int h = sc.nextInt();
        int i = sc.nextInt();
        System.out.println(isIncreasing(g,h,i)?"increasing":isDecreasing(g,h,i)?"decreasing":"neither increasing nor decreasing order");
    }
}
}
