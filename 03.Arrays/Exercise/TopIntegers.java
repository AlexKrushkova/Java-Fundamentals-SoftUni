import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");
        int [] numbers = new int [input.length];

        for (int i = 0; i < input.length ; i++) {
            numbers [i] = Integer.parseInt(input[i]);
        }
        for (int i = 0; i < numbers.length -1; i++) {
            boolean  isBigger = true;
            int currentNum = numbers[i];
            for (int j = i+1; j <numbers.length ; j++) {
                int number = numbers[j];

                if (currentNum <= number){
                    isBigger = false;
                }
            }

            if (isBigger){
                System.out.print(currentNum + " ");
            }
        }
        System.out.print(numbers [numbers.length-1]);
    }
}
