package Strings;

class StringBuf3 {  
    public static void main (String args[])
    {  
        StringBuffer bufStr = new StringBuffer("Lodi");
        System.out.println("bufStr = " + bufStr);
        bufStr.reverse();
        System.out.println("After reversing bufStr = " + bufStr);
        StringBuffer str = new StringBuffer("Delhi is a city.");
        str.insert(11, "very big");
        System.out.println("Now str = " + str);
        str.delete (11,16);
        System.out.println("After deletion str = " + str);
        str.replace (15, 21, "market.");
        System.out.println("New str = " + str);
        str.deleteCharAt(21);
        str.append(" of " ).append("electronic goods.");
        System.out.println(" Now New str = " + str);
      }  
    } 

