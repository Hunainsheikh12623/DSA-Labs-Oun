public class TAsk02 {
    public static void main(String[] args) {
        int N = 6;
        char[] STACK = new char[N];   
        int TOP = 0;  
        
        // In a true stack (abstract data type), insertion without incrementing TOP is not possible.
        //If you keep TOP = 0 and still insert values at random indexes, you are no longer dealing with a stack — 
        //you’re just misusing an array.

       

        
        STACK[2] = 'A';
        STACK[0] = 'B';  

        System.out.println("Stack contents:");
        for (int i = 0; i < N; i++) {
            System.out.println("Loc " + (i + 1) + " -> " + STACK[i]);
        }
    }
}

