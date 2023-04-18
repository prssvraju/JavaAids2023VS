package Strings;

public class StringBuild
 {  
    public static void main(String[] args)
     {  
        StringBuilder builder1 = new StringBuilder("Delhi");
        builder1. append (-110024);
        System.out.println ("The string build = " + builder1);
        StringBuilder builder2 = new StringBuilder();
        System.out.println("The length of builder2 = " + builder2.length());
        System.out.println("The capacity of builder2 = " + builder2.capacity());
        builder2.append("New Delhi");
        System.out.println("The contents of builder2 = " + builder2);  
    }  
} 

