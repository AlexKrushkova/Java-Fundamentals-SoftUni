import java.util.Scanner;

public class PrintNumsInReversed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int [n];

        for (int i = 0; i <n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            numbers [i] = number;
        }

        for (int z = numbers.length - 1; z >=0 ; z--) {
            System.out.print(numbers[z] + " ");

        }

        }
        }
