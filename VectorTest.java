import java.util.Vector;

class VectorTest
{
    public static void main(String args[])
    {
        Vector vc = new Vector(4,2);
        Vector<String> vector_str = new Vector<String>();
        Integer arr[] = new Integer[5];
        System.out.println(vc.capacity());
        vc.add(new Integer(4));
        vc.add(new Integer(4));
        vc.add(new Integer(4));
        vc.add(new Integer(4));
        vc.add(new Integer(4));


        System.out.println(vc);
        vector_str.add("Raghu");
        //vector_str.add(new Integer(10)); will not add integer valuse to vector of type string 

        System.out.println(vc.capacity());
        vc.copyInto(arr);
        for(Integer x:arr)
        {
            System.out.print(x+" ");
        }

    }
}