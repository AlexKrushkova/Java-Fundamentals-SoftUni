import java.util.Scanner;

public class PrintndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        int sumNum = 0;

        for (int i = num1; i <= num2 ; i++) {
            sumNum += i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.printf("Sum: %d", sumNum);
    }
}
