import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double Budget = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double priceLightsabres = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());

        double totalPrice = 0.0;

        double sabresMore = Math.ceil(countStudents*1.10);
        double totalSabresPrice = priceLightsabres*sabresMore;
        double totalRobesPrice = priceRobes*countStudents;
        double freeBelts = countStudents - (countStudents/6);
        double totalBeltPrice = priceBelts*freeBelts;

        totalPrice = totalBeltPrice + totalRobesPrice + totalSabresPrice;

        if (totalPrice<=Budget){
            System.out.printf("The money is enough - it would cost %.2flv.",
                    totalPrice);
        }
        else {
            System.out.printf("Ivan Cho will need %.2flv more.",
                    totalPrice-Budget);
        }
    }
}
