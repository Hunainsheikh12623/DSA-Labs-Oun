import java.util.Scanner;

public class task0301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[30];

        System.out.println("Enter 30 integers:");
        for (int index = 0; index < 30; index++) {
            numbers[index] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        boolean isFound = false;
        for (int index = 0; index < 30; index++) {
            if (numbers[index] == key) {
                System.out.println("Element " + key + " found at position " + index);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Element not present!");
        }
    }
}
