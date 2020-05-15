import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String baverage = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        totalPrice(baverage,count);

        switch (baverage){
            case"coffee":
                coffee(count);
                break;
            case"water":
                water(count);
                break;
            case"coke":
                coke(count);
                break;
            case"snacks":
                snacks(count);
                break;
        }

    }

     static void totalPrice(String baverage, int count) {
    }

    static void snacks(int count) {
        double price = count*2.00;
        System.out.printf("%.2f", price);
    }

     static void coke(int count) {
        double price = count*1.40;
        System.out.printf("%.2f", price);
    }

     static void water(int count) {
        double price = count*1.00;
        System.out.printf("%.2f", price);
    }

    static void coffee(int count) {
        double price = count*1.50;
         System.out.printf("%.2f", price);
    }
}
