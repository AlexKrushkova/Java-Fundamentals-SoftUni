import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("END")) {

            if (reversedString(input).equals(input)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

            input = scanner.nextLine();
        }
    }

    static String reversedString(String input) {
        String reversedName = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedName += input.charAt(i);
        }
        return reversedName;
    }
}
