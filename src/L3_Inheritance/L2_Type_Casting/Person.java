package L3_Inheritance.L2_Type_Casting;

public class Person {
    String name = "Person";

    void greet(){
        System.out.println("Hello Im " + name);
    }
}

class Student extends Person{

    void learn(){
        System.out.println("im learning");
    }

    public static void main(String[] args) {
        Person p = new Person();
        Student s = new Student();

        s.greet();
        s.learn();
        Person pp = s;
        //compiler        runtime
        //compiler ka variable type ko kyi
        //runtime ka sub class hte ka kg ko a lod"
        //Student is a person \but person not student
        //person ka student ma hok loh student ka kg twy ko call loh ma ya

        //super class ko sub class pyg chin yin type casting tone
        Student ss = (Student) p;
        ss.learn();

        Person p2 = new Student();
        //error
        ss = (Student) p2;

    }
}
