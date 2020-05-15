import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers =
                Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        List<Integer> bombInfo =
                Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        int bombNumber = bombInfo.get(0);
        int bombPower = bombInfo.get(1);

        while (numbers.contains(bombNumber)){
            int bombPosition = numbers.indexOf(bombNumber);

            int leftBound = Math.max(0,bombPosition-bombPower);
            int rightBound = Math.min(numbers.size()-1, bombPosition+bombPower);

            for (int i = rightBound; i >= leftBound ; i--) {
                numbers.remove(i);
            }
        }
        int sumOfElements = 0;
        for (int i = 0; i <numbers.size() ; i++) {
            sumOfElements += numbers.get(i);

            // int sum = list.stream().mapToInt(Integer::intValue).sum();
        }
        System.out.println(sumOfElements);
    }
}
