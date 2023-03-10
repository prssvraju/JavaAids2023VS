package Inheritance;

//parent class  
class StudentEx {
    public void methodStudent() {
        System.out.println("The method of the class Student invoked.");
    }
}

class Science extends StudentEx {
    public void methodScience() {
        System.out.println("The method of the class Science invoked.");
    }
}

class Commerce extends StudentEx {
    public void methodCommerce() {
        System.out.println("The method of the class Commerce invoked.");
    }
}

class Arts extends StudentEx {
    public void methodArts() {
        System.out.println("The method of the class Arts invoked.");
    }
}

public class HierarchicalInheritanceExample {
    public static void main(String args[]) {
        Science sci = new Science();
        Commerce comm = new Commerce();
        Arts art = new Arts();
        // all the sub classes can access the method of super class
    
        sci.methodStudent();  
        comm.methodStudent();  
        art.methodStudent();  
    }
}