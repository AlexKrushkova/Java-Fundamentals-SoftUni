import java.util.Scanner;

public class AddSubstract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        sumTwoNums(num1,num2);
        substractLastNum(num1, num2, num3);
    }

     static void substractLastNum(int num1, int num2,  int num3) {
        int result = sumTwoNums(num1,num2)-num3;
         System.out.println(result);

    }

     static int sumTwoNums(int num1, int num2) {
        int resultofSUm = num1+num2;
        return resultofSUm;
    }

}
