package L3_Inheritance.L3_Constructing_Child;

public class Person {
    String name;
    Person (String name){
        this.name = name;
    }
    Person(){

    }
    void greet (){
        System.out.println("Hello im " + name);
    }
}

class Student extends Person{
    //super class yk constructor mr argument pr yin sub class yk
    // constructor mr super ko pyn kaw pay ya ml
    //default constructor so ma kaw ll ya
    Student(String name){
        super(name);
    }

    //di lo ll pya loh ya
    Student(){
        super("Student");
    }

    public static void main(String[] args) {
       Student s = new Student();
       s.greet();

    }
}
