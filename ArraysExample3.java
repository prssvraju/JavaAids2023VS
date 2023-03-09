import java.util.Arrays;  
public class ArraysExample3 
{  
    public static void main(String[] args) 
    {  
        int [] intArray = new int[]{10,20,30,80,90,70,40,36};  
        System.out.println(Arrays.toString(intArray));  
        char [] charArray = new char [] {'u','y', 't','a', 'm','f'}; 
        System.out.println(Arrays.hashCode(charArray));  
        float [] fArray = new float[]{3.4f, 2.5f, 8.5f, 6.4f, 9.5f, 3.2f};  
        System.out.println(Arrays.toString(fArray));  
        int array [] = Arrays.copyOfRange( intArray, 2,6);
        for (int x: array)  
            System.out.print(x +" ");  
        System.out.println();  
    }  
} 


