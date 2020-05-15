import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        gradeResult(Double.parseDouble(scanner.nextLine()));
    }

    static void gradeResult(double number) {
        if (number >= 5.50 && number<=6.00) {
            System.out.println("Excellent");
        }
        else if (number>=4.50){
            System.out.println("Very good");
        }
        else if (number>=3.50){
            System.out.println("Good");
        }
        else if (number>=3.00){
            System.out.println("Poor");
        }
        else{
            System.out.println("Fail");
        }
    }
}
