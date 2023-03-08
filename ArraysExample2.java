import java.util.Arrays;  
public class ArraysExample2 
{  
    public static void main(String[] args) 
    {  
        int [] intArray = new int[]{5,7,2,1,8,6,8,9};  
        int [] Array = new int[]{5,7,2,1,8,6,8,9};  
        System.out.println("Are the intArray and Array equal? "+ Arrays.equals(intArray, Array));  
        char [] charArray = new char [] {'u','y', 't','a', 'm','f'}; 
        float [] fArray =new float[]{3.4f,2.5f,8.5f,6.4f,9.5f};
        Arrays.sort(charArray);  
        for(char ch: charArray)  
            System.out.print(ch + " ");
        System.out.println();  
        int index = Arrays.binarySearch(charArray, 't');
        if(index>=0)  
            System.out.println(" The key is at index value: " + index);
        else  
            System.out.println("The key value is not in the array.");
        for( float flo: fArray)  
            System.out.print(flo + " ");
        System.out.println();  
        float floatArray[] = Arrays.copyOf(fArray,8);  
        for(float y: floatArray)  
            System.out.print(y + " ");
        System.out.println();  
    }  
} 


