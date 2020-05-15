import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] Numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int target = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <Numbers.length ; i++) {
            int firstNum = Numbers[i];
            for (int j = i+1; j <Numbers.length ; j++) {
                int secondNum = Numbers[j];

                if (firstNum+secondNum == target){
                    System.out.println(firstNum + " " + secondNum);
                }
            }
        }
    }
}
