import java.util.Scanner;

public class Passed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double Grade = Double.parseDouble(scanner.next());

        if (Grade>=3.00){
            System.out.println("Passed!");
        }
    }
}
