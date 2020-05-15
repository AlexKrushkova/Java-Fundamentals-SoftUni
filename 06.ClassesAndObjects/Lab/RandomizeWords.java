import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Random random = new Random();

        for (int i = 0; i <words.length; i++) {
            int position = random.nextInt(words.length);

            String swapWord = words[i];
           words[i] = words[position];
           words[position]=swapWord;
        }
        System.out.println(String.join(System.lineSeparator(),words));
    }
}
