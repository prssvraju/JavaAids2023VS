public class Array2D2 
{  
    public static void main(String[] args) 
     {  
        int [][] array = new int [3][];  
        array[0] = new int[]{ 6, 7};  
        array[1] = new int []{10,11,12,14};  
        array[2] = new int [] {2,3,4};  
        for (int i =0; i<3;i++)  
        {
            for (int j = 0; j<array[i].length; j++)  
                System.out.print(array[i][j] + " ");  
            System.out.println();
        }  
    }  
} 

