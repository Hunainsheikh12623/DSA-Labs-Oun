package Lab04;

public class Task040304 {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 6, 8, 1, 5};

        // Selection Sort
        for (int index = 0; index < numbers.length - 1; index++) {
            int minPos = index;
            for (int k = index + 1; k < numbers.length; k++) {
                if (numbers[k] < numbers[minPos]) {
                    minPos = k;
                }
            }
            int swap = numbers[minPos];
            numbers[minPos] = numbers[index];
            numbers[index] = swap;
        }

        System.out.print("Selection Sort Result: ");
        for (int value : numbers) {
            System.out.print(value + " ");
        }
        System.out.println();


        // Insertion Sort
        int[] data = {2, 3, 6, 8, 1, 5};

        for (int pos = 1; pos < data.length; pos++) {
            int element = data[pos];
            int prev = pos - 1;

            while (prev >= 0 && data[prev] > element) {
                data[prev + 1] = data[prev];
                prev = prev - 1;
            }
            data[prev + 1] = element;
        }

        System.out.print("Insertion Sort Result: ");
        for (int value : data) {
            System.out.print(value + " ");
        }
    }
}
