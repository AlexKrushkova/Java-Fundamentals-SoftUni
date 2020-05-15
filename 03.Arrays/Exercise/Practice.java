import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] Array1 = scanner.nextLine().split(" ");
        String [] Array2 = scanner.nextLine().split(" ");

        for (int i = 0; i <Array2.length ; i++) {
            for (int j = 0; j <Array1.length ; j++) {
                if (Array2[i].equals( Array1[j])){
                    System.out.print(Array2[i]+ " ");
                }

            }

        }

    }
}