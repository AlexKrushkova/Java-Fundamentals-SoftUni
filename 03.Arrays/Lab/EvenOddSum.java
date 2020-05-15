import java.util.Arrays;
import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int oddsum = 0;
        int evensum = 0;

        for (int i = 0; i <numbers.length ; i++) {
            if (numbers[i] % 2 == 0) {
                evensum += numbers[i];
            } else {
                oddsum += numbers[i];
            }
        }
            System.out.println(evensum-oddsum);
    }
}
