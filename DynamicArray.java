class DynamicArray 
{  
     public static void main (String args[])  
    {  
        int [] kim = new int [5];  
        int i,k;  
        for (i = 0;i<5; i++)  
            kim[i] = 1 + i;  
        for (k = 0;k<5; k++)  
            System.out.print(kim[k] + " ");
        System.out.println();  
        kim = new int [10]; 
        for (k = 0;k<10; k++)  
            System.out.print(kim[k] + " ");  
        System.out.println();  
    } 
} 


