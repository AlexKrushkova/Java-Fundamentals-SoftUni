import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationsAdvance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (true) {
            String line = scanner.nextLine();

            if (line.equals("end")) {
                break;
            }
            String[] tokens = line.split(" ");


            if (tokens[0].equals("Contains")) {
                int numberContains = Integer.parseInt(tokens[1]);
                if (numbers.contains(numberContains)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (tokens[0].equals("Print")) {
                for (int i = 0; i <numbers.size() ; i++) {
                    if (i%2==0){

                    }
                }
                if (tokens[1].equals("even")) {

                } else if (tokens[1].equals("odd")) {

                }
            }
            else if (tokens[0].equals("Get")) {
                int sumNums = 0;
                for (int i:numbers) {
                    sumNums+=i;
                }
                System.out.println(sumNums);
            }
            else if (tokens[0].equals("Filter")){
                int number = Integer.parseInt(tokens[2]);
                switch (tokens[1]){
                    case"<":
                        break;
                    case">":
                        break;
                    case"<=":
                        break;
                    case">=":
                        break;
                }
            }

        }
    }
}