class Faculty
{
    String name;
    int age;
    Faculty()
    {
        name ="Something";
        age=25;
    }
    Faculty(String s,int a)
    {
        name =s;
        age=a;
    }
    void talk()
    {
        System.out.println("Hello my name is "+name);
        System.out.println("My age is"+age);
    }
}
public class FacultyInfo {
    public static void main(String args[])
    {
        Faculty f1 = new Faculty();
        System.out.println("F1 hash code is"+f1.hashCode());
        f1.talk();

        Faculty f2 = new Faculty("Raghu",34);
        System.out.println("F2 hash code is"+f2.hashCode());
        f2.talk();
    }  
}
