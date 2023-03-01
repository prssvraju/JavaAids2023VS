/*
1.this can be used to refer current class instance variable.
2.this can be used to invoke current class method (implicitly)
3.this() can be used to invoke current class constructor.
4.this can be passed as an argument in the method call.

5.this can be passed as argument in the constructor call.
6.this can be used to return the current class instance from the method.
*/

class Student {
    int rollno;
    String name;
    float fee;

    Student(int rollno, String name, float fee) {
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + fee);
    }
}

class A {
    void m() {
        System.out.println("hello m");
    }

    void n() {
        System.out.println("hello n");
        // m();//same as this.m()
        this.m();
    }
}

class B {
    B() {
        System.out.println("hello B");
    }

    B(int x) {
        this();
        System.out.println(x);
    }
}

class Student2 {
    int rollno;
    String name, course;
    float fee;

    Student2(int rollno, String name, String course) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
    }

    Student2(int rollno, String name, String course, float fee) {
        this(rollno, name, course);// reusing constructor
        this.fee = fee;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + course + " " + fee);
    }
}

class S2 {
    int x = 9;

    void m(S2 obj) {
        System.out.println("method is invoked And Value is " + obj.x);
    }

    void p() {
        m(this);
    }
}

class C {
    A4 obj;

    C(A4 obj) {
        this.obj = obj;
    }

    void display() {
        System.out.println(obj.data);// using data member of A4 class
    }
}

class A4 {
    int data = 10;

    A4() {
        C cobj = new C(this);
        cobj.display();
    }
}

class D {
    D getD() {
        return this;
    }

    void msg() {
        System.out.println("Hello java");
    }
}

public class ThisExample {
    public static void main(String args[]) {
        // 1.this can be used to refer current class instance variable.
        Student s1 = new Student(111, "ankit", 5000f);
        Student s2 = new Student(112, "sumit", 6000f);
        s1.display();
        s2.display();

        // 2.this can be used to invoke current class method (implicitly)
        A a = new A();
        a.n();

        // 3.this() : to invoke current class constructor
        B b = new B(10);

        Student2 s2obj1 = new Student2(111, "ankit", "java");
        Student2 s2obj2 = new Student2(112, "sumit", "java", 6000f);
        s2obj1.display();
        s2obj2.display();

        // 4.this: to pass as an argument in the method
        S2 s2obj = new S2();
        s2obj.p();

        // this: to pass as argument in the constructor call
        A4 a4obj = new A4();

        //this can be used to return the current class instance from the method.
        new D().getD().msg();  

    }
}