import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        vowelsCount(input);
    }

    private static void vowelsCount(String input) {
        int counter = 0;
        for (int i = 0; i <input.length() ; i++) {
                   if (input.charAt(i) == 'a'
                    || input.charAt(i) == 'e'
                    || input.charAt(i) == 'i'
                    || input.charAt(i) == 'o'
                    || input.charAt(i) == 'u'
                    || input.charAt(i) == 'A'
                    || input.charAt(i) == 'E'
                    || input.charAt(i) == 'I'
                    || input.charAt(i) == 'O'
                    || input.charAt(i) == 'U') {
                counter++;
            }
        }
            System.out.println(counter);

    }
}
