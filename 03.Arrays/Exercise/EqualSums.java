import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        String output = "no";
        for (int i = 0; i <input.length ; i++) {
            int leftSum = 0;
            int rightSum = 0;

        for (int l = 0; l <i ; l++) {
            leftSum+=input[l];
        }
        for (int r = i+1; r <input.length ; r++) {
                rightSum+=input[r];
            }
        if (leftSum==rightSum){
           output = i + "";
            break;
        }
        }
        System.out.println(output);
    }
}
