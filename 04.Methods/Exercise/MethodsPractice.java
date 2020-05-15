import java.util.Scanner;

public class MethodsPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(gerNameReversed(name));
    }

    static String gerNameReversed(String name) {
        String reversedName = "";
        for (int i = name.length()-1; i >=0 ; i--) {
            reversedName+= name.charAt(i);
        }
        return reversedName;
    }

}
