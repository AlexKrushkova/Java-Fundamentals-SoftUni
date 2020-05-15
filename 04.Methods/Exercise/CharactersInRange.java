import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char input1 = scanner.nextLine().charAt(0);
        char input2 = scanner.nextLine().charAt(0);
        asciiTableOutput(input1,input2);
    }

    private static void asciiTableOutput(char input1, char input2) {
        String output = "";
        if (input2<input1){
            char firstOldValue = input1;
            input1 = input2;
            input2 = firstOldValue;
        }
        for (char i = (char)(input1+1) ; i < input2; i++) {
            output+=i + " ";
            }
            System.out.print(output);
        }
    }