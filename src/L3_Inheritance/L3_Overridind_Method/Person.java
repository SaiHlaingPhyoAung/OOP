package L3_Inheritance.L3_Overridind_Method;

public class Person {
    //override ka inheritance shi mha override shi
    //override pyit poh method signature (name , argument list)  tu mha pyit
    //**super class ka public so sub class ka default pyit loh ma ya**
    //**super class ka range kyin p sub class ka range kyal yin ya **
    //**return type ka tu ma override pyit**
    //static method / variable so override ma pyit
    //variable mr override ma pyit
    //method mr pl override pyit

    /*
    Overload
    Name tu p Mathod signature ma tu yin Overload
     */


    void greet(){
        System.out.println("this is super class");
    }
    static void g(){
        System.out.println("this is super static");
    }}

class Student extends Person{
    void greet (){
        System.out.println("this is sub class");
    }

    static void g(){
        System.out.println("this is sub static");
    }
    public static void main(String[] args) {
        Person p = new Person();
        p.greet();
        g();
        Person.g();
    }


}
