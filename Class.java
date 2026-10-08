class Class{
    int n;  // instance variable
    static int c = 30;

    void method1(){
        int a; // local variable

        System.out.println("static variable: "+new Class().c);
        System.out.println("static variable: "+c);
        System.out.println("static variable: "+Class.c);
    }

    public static void main(String[] args) {
        Class obj = new Class();
        obj.method1();
    }
}

