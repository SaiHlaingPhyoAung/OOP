package L4_Composition;

public class Engine {
    public void drive(){
        System.out.println("Driving");
    }
}

//Inheritance ka is a relation pyit loh is a relation ma pyit chin yin composition ko tone
class Car{
    private Engine engine;

    public Car(Engine engine){
        this.engine = engine;
    }
    public void drive(){
        this.engine.drive();
    }
}
