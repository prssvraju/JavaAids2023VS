public class ArrayOperations
{  
    public static void main(String[] args) 
    {  
        int []array1 = new int [] {1,2,3,4,5};  
        int [] array2;  array2 = new int [5];  
        for(int k = 0; k<5; k++)  
            array2[k] = 2*k; //assigning values to elements  
        System.out.println("The elements of array1 are as below.");  
        display(array1);  
        System.out.println("The elements of array2 are as below.");  
        display(array2);  
        for (int j = 0; j<5; j++)  
        {
            array1[j] += 3;// 3 is added to elements of array1  
            array2[j] *=2;
        }// elements of array2 are multiplied by 2 
        System.out.println("New elements of Array1 after adding 3 are as below.");  
        display(array1);  
        System.out.println("New elements of array2 after multiplying by 2  are as below.");
        display(array2);  
    }  // method definition for display of array 
    public static void display(int[] array)  
    {
        for (int z: array)  
            System.out.print(z + " ");  
        System.out.println();  
    }  
} 


