import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        isTopNumber(numbers);


    }

    private static void isTopNumber(int[] numbers) {
        boolean numberIsDeviceble = false;
        int deviceble = 0;
        boolean numberhasAnOdd = false;
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        if (sum % 8 == 0) {
            deviceble = sum;
            numberIsDeviceble = true;
        }
        numberhasAnOdd(int deviceble);
    }


        }

        }
        {

        }
        } {

        }
    }
}

