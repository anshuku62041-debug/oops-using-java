public class ClassA {

    void method1(){
        System.out.println("I am method1");
    }

      ClassA(){
        System.out.println("Constructor");
    }

     void ClassA(){
        System.out.println("I am also a method");
    }

    private ClassA(int a){
        System.out.println(" arg Constructor");
    }

    public static void main(String[] args) {
        ClassA a = new ClassA(5);
        a.ClassA();
        a.method1();

        ClassA b = new ClassA();
       
    }

}
