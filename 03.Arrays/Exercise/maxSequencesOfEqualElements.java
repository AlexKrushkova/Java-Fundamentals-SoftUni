import java.util.Arrays;
import java.util.Scanner;

public class maxSequencesOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] Numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int bestNum = Numbers[0];
        int bestCount = 1;

        for (int i = 0; i <Numbers.length ; i++) {
            int currentNum = Numbers[i];
            int currentCount = 1;
            for (int j = i+1; j <Numbers.length ; j++) {
                int number = Numbers[j];
                if (currentNum == number){
                    currentCount++;
                    if (currentCount > bestCount){
                        bestCount = currentCount;
                        bestNum  = currentNum;
                    }
                }
                else {
                    currentCount = 0;
                    break;
                }
            }
        }
        for (int i = 0; i < bestCount; i++) {
            System.out.print(bestNum + " ");


        }
    }
}
