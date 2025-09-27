package Lab04;
import java.util.*;

public class Task0401 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float[] arr = new float[20];

        for (int i = 0; i < arr.length; i++)  {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextFloat();
        }

        String userInput;
        System.out.println("Enter the sorting order (asc/desc): ");
        userInput = sc.next();


        sc.close();
        System.out.println("You entered the following numbers:");

        //bubble sort
      if(userInput.equals("asc")) {
          for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        float temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            for (float num : arr) {
                System.out.print(num + " ");
            }
        }

        else if(userInput.equals("desc")) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] < arr[j + 1]) {
                        float temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            for (float num : arr) {
                System.out.print(num + " ");
            }
        }

        else{
            return;
        }

    }
}
