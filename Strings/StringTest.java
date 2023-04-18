package Strings;

public class StringTest 
{ 
     public static void main(String[] args) 
     {  
        String strx = "abcd"; //object stored in pool  
        String stry = "abcd"; //only one "abcd" exists in pool  
        String strz = new String("abcd"); //new object  
        String str1 = new String ("abcd");// new object  
        String s2 = new String();// empty string  
        String s1 = "";// empty string  
        System.out.println("Are references of strx and stry same? " + (strx==stry));  
        System.out.println("Are references of strx and strz same? " + (strx==strz));  
        System.out.println("Are references of str1 and strz same? " + (str1==strz));  
        System.out.println("Are references of s1 and s2 same? " + (s1==s2));  
        System.out.println("Are strx and strz equal? " + strx.equals(strz));  
    }  
} 

