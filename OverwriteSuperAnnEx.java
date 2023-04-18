class XX {
    public void display(){System.out.println("This is class XX.");  
}
}// end of class XX 
class YY extends XX {
    @Override public void  display()
    {
        System.out.println("This is class YY."); 
    }
}// end of class YY 
class ZZ extends XX 
{  @Override 
    public void display(){
        System.out.println("This is class ZZ."); 
    }
}// end of class ZZ // below is class with main method public
 class OverrideSuper {
     public static void main (String Str[]) 
     { 
        XX objX = new XX(); 
        YY objY = new YY(); 
        ZZ objZ = new ZZ(); 
        objX.display(); 
        objY.display();
        objZ.display();
     }
 }

