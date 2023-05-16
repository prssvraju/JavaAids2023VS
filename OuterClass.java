class OuterClass {
    private int privInt = 10;

    class InnerClass {
        public void accessOuter() {
            System.out.println("The outer class's privInt is " + privInt);
        }
    }
 
    public static void main(String[] args) {
        // create instance of outer class first:
        OuterClass outClass = new OuterClass();
        OuterClass.InnerClass inner = outClass.new InnerClass();
        inner.accessOuter();

        //Shorter version
        //OuterClass.InnerClass inner =  new OuterClass().new InnerClass(); 
        //inner.accessOuter();


    }

}
