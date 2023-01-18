package L7_Polymorphism;

public class Polymorphism {
    /*
    Poly          morphe
    (Many)       (Form, Shap)
     */

    public static void main(String [] args) {
        Bird bird1 = new Craw();
        bird1.fly();
        Bird bird2 = new Eagle();
        bird2.fly();
        Bird bird3 = bird2;
        bird3.fly();
        Bird bird4 = (Bird) bird1;
        bird4.fly();
    }
}
class Bird {
    public void fly() {
        System.out.println("Bird is flying!");
    }
}
class Eagle extends Bird {
    public void fly() {
        System.out.println("Eagle is flying!");
    }
}
class Craw extends Bird {
    public void fly() {
        System.out.println("Craw is flying!");
    }
}
