import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstlist = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List <Integer> merged = new ArrayList<>();

        int maxSize = Math.max(firstlist.size(),secondList.size());
        for (int i = 0; i <maxSize ; i++) {
            if (i < firstlist.size()) {
                merged.add(firstlist.get(i));
            }
            if (i<secondList.size()) {
                merged.add(secondList.get(i));
            }
        }
        for (int number:merged
             ) {
            System.out.print(number + " ");
        }

    }
}
