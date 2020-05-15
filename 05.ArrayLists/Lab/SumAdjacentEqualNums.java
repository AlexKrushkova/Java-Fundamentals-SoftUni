import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers =
                Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).
                        collect(Collectors.toList());

        int i = 0;
        while (i<numbers.size()-1){
            double currentNum = numbers.get(i);
            double nextNum = numbers.get(i+1);
            if (currentNum==nextNum){
                double sum = currentNum+nextNum;
                numbers.set(i,sum);
                numbers.remove(i +1);
                i=0;
            }
            else{
                i++;
            }
        }
        for (double number:numbers
             ) {
            System.out.printf("%.0f ", number);

        }
    }
}
