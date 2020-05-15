import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGameCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double moneySpend = 0.0;

        int countHeadset = lostGameCount/2;
        int countMouse = lostGameCount/3;
        int countKeyboard = lostGameCount/6;
        int countDisplay = lostGameCount/12;

        moneySpend = countDisplay*displayPrice + countHeadset*headsetPrice + countMouse*mousePrice + countKeyboard*keyboardPrice;

        System.out.printf("Rage expenses: %.2f lv.", moneySpend);
    }
}