public class Task02 {
    public static void main(String[] args) {
        int capacity = 6;
        char[] stackArray = new char[capacity];   
        int topIndex = 0;  
        
        // In a true stack (abstract data type), insertion without incrementing topIndex is not possible.
        // If you keep topIndex = 0 and still insert values at random indexes, you are no longer dealing with a stack — 
        // you’re just misusing an array.

        stackArray[2] = 'A';
        stackArray[0] = 'B';  

        System.out.println("Stack contents:");
        for (int i = 0; i < capacity; i++) {
            System.out.println("Loc " + (i + 1) + " -> " + stackArray[i]);
        }
    }
}
