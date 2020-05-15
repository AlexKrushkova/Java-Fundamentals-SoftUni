import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> guests = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String nameGoing = scanner.nextLine();
            String[] token = nameGoing.split("\\s+");

            switch (token[2]) {
                case "going!":

                    if (guests.contains(token[0])) {
                        System.out.printf("%s is already in the list! %n",token[0]);
                    } else {
                        guests.add(token[0]);
                    }
                    break;
                case "not":
                    if (guests.contains(token[0])) {
                        guests.remove(token[0]);
                    } else {
                        System.out.printf("%s is not in the list! %n",token[0]);
                        break;
                    }
            }
            }
        for (String name : guests){
            System.out.println(name);
        }
    }
}
