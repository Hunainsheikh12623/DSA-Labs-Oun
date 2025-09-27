package Lab04;
import java.util.*;

public class Task0401 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float[] numbers = new float[20];

        for (int index = 0; index < numbers.length; index++)  {
            System.out.print("Enter number " + (index + 1) + ": ");
            numbers[index] = input.nextFloat();
        }

        String order;
        System.out.println("Enter the sorting order (asc/desc): ");
        order = input.next();

        input.close();
        System.out.println("You entered the following numbers:");

        //bubble sort
        if(order.equals("asc")) {
            for (int index = 0; index < numbers.length - 1; index++) {
                for (int j = 0; j < numbers.length - index - 1; j++) {
                    if (numbers[j] > numbers[j + 1]) {
                        float swap = numbers[j];
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = swap;
                    }
                }
            }
            for (float value : numbers) {
                System.out.print(value + " ");
            }
        }

        else if(order.equals("desc")) {
            for (int index = 0; index < numbers.length - 1; index++) {
                for (int j = 0; j < numbers.length - index - 1; j++) {
                    if (numbers[j] < numbers[j + 1]) {
                        float swap = numbers[j];
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = swap;
                    }
                }
            }
            for (float value : numbers) {
                System.out.print(value + " ");
            }
        }

        else{
            return;
        }

    }
}
