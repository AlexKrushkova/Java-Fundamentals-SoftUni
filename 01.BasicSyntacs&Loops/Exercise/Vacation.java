import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double totalPrice = 0.0;
        double priceper1 = 0.0;

        if (typeGroup.equals("Students")) {
            switch (dayOfWeek) {
                case "Friday":
                    priceper1 = 8.45;
                    break;
                case "Saturday":
                    priceper1 = 9.80;
                    break;
                case "Sunday":
                    priceper1 = 10.46;
            }
        }
        else if (typeGroup.equals("Business")) {
            switch (dayOfWeek) {
                case "Friday":
                    priceper1 = 10.90;
                    break;
                case "Saturday":
                    priceper1 = 15.60;
                    break;
                case "Sunday":
                    priceper1 = 16.00;
            }
        }
        else if (typeGroup.equals("Regular")) {
            switch (dayOfWeek) {
                case "Friday":
                    priceper1 = 15.00;
                    break;
                case "Saturday":
                    priceper1 = 20.00;
                    break;
                case "Sunday":
                    priceper1 = 22.50;
            }
        }


        totalPrice = priceper1 * peopleCount;

        if (typeGroup.equals("Students") &&(peopleCount>=30)){
            totalPrice -= totalPrice*0.15;
        }
        if (typeGroup.equals("Business")&&peopleCount>= 100){
            totalPrice-= 10*priceper1;
        }
        else if (typeGroup.equals("Regular") && peopleCount>=10 && peopleCount<=20){
            totalPrice-=totalPrice*0.05;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
