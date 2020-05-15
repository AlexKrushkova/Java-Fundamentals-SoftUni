import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] DaysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
        "Saturday", "Sunday"};

        int daysNum = Integer.parseInt(scanner.nextLine());

        if (daysNum>=1 && daysNum<=7){
            System.out.println(DaysOfWeek [daysNum-1]);
        }
        else{
            System.out.println("Invalid day!");
        }
    }
}
