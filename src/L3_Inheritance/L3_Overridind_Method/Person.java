package L3_Inheritance.L3_Overridind_Method;

public class Person {
    //override ka inheritance shi mha override shi
    //override pyit poh method signature (name , argument list)  tu mha pyit
    //**super class ka public so sub class ka default pyit loh ma ya**
    //**super class ka range kyin p sub class ka range kyal yin ya **
    //**return type ka tu ma override pyit**
    //static method so override ma pyit
    //variable mr override ma pyit
    //method mr pl override pyit


    void greet(){
        System.out.println("this is super class");
    }
}

class Student{
    void greet (){
        System.out.println("this is sub class");
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.greet();
    }
}
