import java.util.Scanner;

public class EncryptSortAndPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] name = new String[n];
        int namesum = 0;

        for (int i = 0; i < n; i++) {
            name[i] = scanner.nextLine();
        }
        for (int l = 0; l < name.length; l++) {
            if ("aeiouAEIOU".equals(l)) {
                namesum += l * name.length;
            } else {
                namesum += l / name.length;
            }

            System.out.println(namesum);
            {
            }
        }
    }
}
