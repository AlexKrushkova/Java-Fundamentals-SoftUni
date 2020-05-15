import java.io.CharArrayReader;
import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        if (checkIfIsBetween(password) &&
        checkIfContains(password)&&
        chekIfHaveTwoDigits(password)){
            System.out.println("Password is valid");
        }
        if (!checkIfIsBetween(password)){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!checkIfContains(password)){
            System.out.println("Password must consist only of letters and digits");
        }
        if (!chekIfHaveTwoDigits(password)) {
            System.out.println("Password must have at least 2 digits");
        }

    }

     static boolean checkIfIsBetween (String password){
        return password.length()>=6 &&password.length()<=10;
         }

     static boolean checkIfContains(String password) {
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            boolean isDigit = Character.isDigit(symbol);
            boolean isLetter = Character.isLetter(symbol);

            if (!isDigit && !isLetter) {
                return false;
            }
        }
        return true;
    }

     static boolean chekIfHaveTwoDigits (String password) {
        int count = 0;
         for (int i = 0; i <password.length() ; i++) {
             char symbol = password.charAt(i);
             if (Character.isDigit(symbol)) {
                 count++;
             }
             if (count == 2) {
                 return true;
             }
         }
             return false;
         }

    }
