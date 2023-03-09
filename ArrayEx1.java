public class ArrayEx1 {
    public static void main(String Str[]) {
        int[] array1, array2; // Declaration of arrays
        array1 = new int[5];// allocation of memory
        array2 = new int[5];// allocation of memory
        for (int k = 0; k < 5; k++) // assigning values
        {
            array1[k] = 2 * k;
            array2[k] = 3 * k;
        }
        display(array1);// Display of elements.
        display(array2);
    } // Below is the definition of method Display.

    public static void display(int[] array) {
        for(int x:array)
        {
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
