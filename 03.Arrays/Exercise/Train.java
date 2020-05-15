
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int [] peopleCount = new int [people];

        int peopleSum = 0;
        String PeopleCounttt = "";

        for (int i = 0; i <peopleCount.length ; i++) {
            peopleCount[i] = Integer.parseInt(scanner.nextLine());
            peopleSum += peopleCount[i];

            PeopleCounttt += peopleCount[i] + " ";


        }
        System.out.println(PeopleCounttt);
        System.out.print(peopleSum);
    }
}
