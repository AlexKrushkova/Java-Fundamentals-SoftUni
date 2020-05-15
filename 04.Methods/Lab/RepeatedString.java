import java.util.Scanner;

public class RepeatedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        String repeated =repeatedStringOutput(input, n);
        System.out.println(repeated);

    }
    static String repeatedStringOutput(String input, int n) {
        String[] repeatArr = new String[n];

        for (int i = 0; i < repeatArr.length; i++) {
            repeatArr[i] = input;
        }
        return String.join("",repeatArr);
    }
}
