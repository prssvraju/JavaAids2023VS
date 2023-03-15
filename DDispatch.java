class X 
{  
    void display ()
    { 
        System.out.println("This is class X.");  
    }
}  
class Y extends X// inheriting class X  
{
    void display ()
    { 
        System.out.println("This is class Y.");  
    }
}  
class Z extends Y// inheriting class Y  
{
    void display ()
    { 
        System.out.println("This is class Z.");  
    }
}  
class DDispatch
{// class with main method  
    public static void main (String Str[])
    {  
        X objX = new X();// creates object reference to class X  
        Y objY = new Y();// creates object reference to class Y  
        Z objZ = new Z();// creates object reference to class Z  
        X RefX = objX;// X class reference assigned ObjX reference 
        RefX.display ();  
        RefX = objY;// reference objY assigned to RefX  
        RefX.display ();  
        RefX = objZ; //reference objZ assigned to RefX  
        RefX. display();  
    }  
} 

