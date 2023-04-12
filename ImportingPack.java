import packagedemo.*;
import packagedemo.mypack.*;;
public class ImportingPack {
    public static void main(String args[])
    {
     MyOne obj = new MyOne();
     Second obj2 = new Second();
     System.out.println(obj.getInfo());
     System.out.println(obj2.getDetails());

    }
}
