package L8_Nested_Class;

public class L4_Anonymous_Class {

    static {
        MyClass myClass = new MyClass(){
            void doSomething(){
                System.out.println("This is override abstract method");
            }

        };
        myClass.greet();
        myClass.doSomething();
    }

}
    //abstract class
    abstract class MyClass{
    abstract void doSomething();
        void greet(){
            System.out.println("Hello Anonymous Class");
        }
    }


