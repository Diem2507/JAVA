/*import java.util.*;
public class Main {
    public static void main(String[] arg){
        Scanner num = new Scanner(System.in);
        System.out.print("Number: ");
        int number = num.nextInt();
        if (number % 5 == 0 && number % 3 == 0){
            System.out.println("FizzBuzz");
        }
        else if (number % 5 == 0){
            System.out.println("Fizz");
        }
        else if (number % 3 == 0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(number);
        }
    }
}
*/


import java.util.Scanner;
public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int number = sc.nextInt();
        String str = (number % 5 == 0 && number % 3 == 0) ? "FizzBuzz" : (number % 3 == 0) ? "Buzz" : (number % 5 == 0) ? "Fizz" : "Number";
        if (str == "Number"){
            System.out.println(number);
        }
        else {
            System.out.println(str);
        }
        sc.close();
    }
}




