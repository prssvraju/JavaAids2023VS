package Strings;

class StringBuf2 
    {  
        public static void main (String args[])
        {  
            StringBuffer bufStr = new StringBuffer("Amritsar is a holy city.");
            System.out.println("bufStr = " + bufStr);
            System.out.println("Length of bufStr = " + bufStr.length());
            bufStr.setLength (8);
            System.out.println("New Length of bufStr = " + bufStr.length());
            System.out.println("Capacity of bufStr = " + bufStr.capacity());
            System.out.println("New bufStr = " + bufStr);
            char ch = bufStr.charAt(4);
            System.out.println("Character at 4th position = " + ch);
            bufStr.setCharAt(6, 'e');
            System.out.println("Now New bufStr = " + bufStr);
        }  
    } 

