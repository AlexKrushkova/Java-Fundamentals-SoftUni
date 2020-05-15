import java.util.Scanner;

public class MiddleChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        middleCharString(input);
    }

    private static void middleCharString(String input) {

        int position;
        int lenght;
        if (input.length()%2==0){
            position = input.length()/2-1;
            lenght = 2 ;
        }
        else{
            position = input.length()/2;
            lenght=1;
        }
        System.out.print(input.substring(position,position+lenght));
    }
}
