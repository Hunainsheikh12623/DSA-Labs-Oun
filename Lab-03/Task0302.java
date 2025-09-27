import java.util.Scanner;

public class Task0302 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[20];

        System.out.println("Enter 20 integers in sorted order:");
        for (int index = 0; index < 20; index++) {
            numbers[index] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        int left = 0, right = 19;
        boolean isFound = false;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (numbers[middle] == key) {
                System.out.println("Element " + key + " found at index " + middle);
                isFound = true;
                break;
            } else if (numbers[middle] > key) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        if (!isFound) {
            System.out.println("Element not present!");
        }
    }
}
