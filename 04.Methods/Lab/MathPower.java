import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = Double.parseDouble(scanner.nextLine());
        int numPow = Integer.parseInt(scanner.nextLine());
        double mathPower = mathPow(num1, numPow);
        System.out.println(new DecimalFormat("0.####").format(mathPower));
    }

     static double mathPow(double num1, int numPow) {
        double result = Math.pow(num1,numPow);
        return  result;
    }
}
