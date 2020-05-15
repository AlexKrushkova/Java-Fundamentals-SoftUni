import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagons = new ArrayList<>();
        String[] input = scanner.nextLine().split(" ");

        for (int i = 0; i < input.length; i++) {
            wagons.add(Integer.parseInt(input[i]));
        }
        int capacity = Integer.parseInt(scanner.nextLine());

        String line =scanner.nextLine();
        while (!"end".equals(line)) {
            String[] tokens = line.split(" ");

            if (tokens[0].equals("Add")) {
                int passengers = Integer.parseInt(tokens[1]);
                wagons.add(passengers);
            }
            else {
                int passengers = Integer.parseInt(tokens[0]);

                for (int i = 0; i < wagons.size(); i++) {
                    int futureNumber = wagons.get(i) + passengers;
                    if (futureNumber <= capacity) {
                        wagons.set(i, futureNumber);
                        break;
                    }
                }
            }
            line =scanner.nextLine();
        }
        printList(wagons);
    }
    static void printList(List<Integer> wagons) {
        for (int i = 0; i <wagons.size() ; i++) {
            System.out.print(wagons.get(i)+ " ");
        }
    }
}
