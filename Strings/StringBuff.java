package Strings;

class StringBuf {
    public static void main (String Args[])  { 
         StringBuffer str1 = new StringBuffer("Delhi is a big city.");
         StringBuffer str2 = new StringBuffer("Kanpur is also big city");  
         System.out.println("str1 = " + str1);  
         System.out.println("str2 = " + str2); 
         System.out.println("Length of str1 = " + str1.length());  
         System.out.println("Length of str2 = " + str2.length());  
         System.out.println("Capacity of str1 = "+ str1.capacity());  
         System.out.println("Capacity of str2 = " + str2.capacity());  
         str1.ensureCapacity(80);  
         System.out.println("New capacity of str1 = " + str1.capacity());  
        }
}
