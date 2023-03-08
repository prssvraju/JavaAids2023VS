public class ArraysEx2
{  
    public static void main(String[] args) 
    {  
        int[] numbers = {15,16,17,18,20}; //Array definition  
        int [] numbs = new int[] {5,6,7,8,9};  
        int p [];// declaration of array  
        p = new int [5]; //Assigning memory  
        for (int i =0; i<5; i++) //assigning values to p 
         p[i] = i + 2;  
         for (int k: numbers)  
            System.out.print (k +" "); //output of array numbers  
        System.out.println();  
        for(int x: numbs)  
            System.out.print( x + " ");  
        System.out.println();  
        for (int n: p)  
            System.out.print (n +" "); //output of array p  
        System.out.println();  
    }  
} 

