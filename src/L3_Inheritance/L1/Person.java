package L3_Inheritance.L1;

public class Person {
    //Inheritance lod yin IS A RELATION pyit
    String name = "Person";

    void greet(){
        System.out.println("Hello I'm " + name);
    }

    private void doPrivate(){
        System.out.println("private work");
    }
}

class Student extends Person{
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.name);
        p.greet();

    }

    void callParents(){
        greet();
    }
}
