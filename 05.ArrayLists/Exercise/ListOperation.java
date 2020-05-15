import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elements = Arrays.stream(scanner.nextLine()
                .split("\\s+")).collect(Collectors.toList());
        String line;

        while (!"End".equals(line = scanner.nextLine())) {
            String[] token = line.split("\\s+");
            String command = token[0];

            switch (command){
                case"Add":
                    String element = token[1];
                    elements.add(element);
                    break;
                case"Remove":
                    int index = Integer.parseInt(token [1]);
                    if (index >=0 && index<elements.size()) {
                        elements.remove(index);
                    }
                    else{
                        System.out.println("Invalid index");
                        break;
                    }
                    break;

                case"Insert":
                    element = token[1];
                    int position = Integer.parseInt(token[2]);
                    if (0 <= position && position < elements.size()) {
                        elements.add(position, element);
                    }else{
                        System.out.println("Invalid index");
                    }
                    break;

                case"Shift":

                    if (token[1].equals("right")){
                        String movement = token[2];
                        Collections.rotate(elements, Integer.parseInt(movement));
                    }
                    else if (token[1].equals("left")){
                        String movement = token[2];
                        int movementRotation = Integer.parseInt(movement);
                        Collections.rotate(elements, -movementRotation);
                }
                    break;
            }
        }
        System.out.println(elements.toString().replaceAll("[\\[\\],]", ""));
    }
}