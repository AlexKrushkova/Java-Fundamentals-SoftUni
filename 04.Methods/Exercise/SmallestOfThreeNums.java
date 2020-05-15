import java.util.Scanner;

public class SmallestOfThreeNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        SmallestNumber(a,b,c);
    }

    private static void SmallestNumber(int a, int b, int c) {
        if (a>b&&c>b){
            System.out.println(b);
        }
        else if (a<b&a<c){
            System.out.println(a);
        }
        else {
            System.out.println(c);
        }
    }
}
