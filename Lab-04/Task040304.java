package Lab04;

public class Task040304 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 8, 1, 5};

        // Selection Sort
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.print("Selection Sort Result: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();


        // Insertion Sort
        int[] arr2 = {2, 3, 6, 8, 1, 5};

        for (int i = 1; i < arr2.length; i++) {
            int key = arr2[i];
            int j = i - 1;

            while (j >= 0 && arr2[j] > key) {
                arr2[j + 1] = arr2[j];
                j = j - 1;
            }
            arr2[j + 1] = key;
        }

        System.out.print("Insertion Sort Result: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }

           

    
    }
    
}
