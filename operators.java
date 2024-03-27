import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a, b;

         System.out.println("enter the value of a and b");

        a = scan.nextDouble();
        b = scan.nextDouble();

       double result = a + b;
       System.out.println("result is = " + result);

       result = a - b;
       System.out.println("result is = " + result);

       result = a * b;
       System.out.println("result is = " + result);

       result = a / b;
       System.out.println("result is = " + result);
    }
}
