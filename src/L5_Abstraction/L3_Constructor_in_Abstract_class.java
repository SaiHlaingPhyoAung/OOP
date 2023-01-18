package L5_Abstraction;

public class L3_Constructor_in_Abstract_class {
}
abstract class a{
    String name ;
    a(String name){
        this.name = name;
    }
}

abstract class b extends a{
    b(String name){
        super(name);
    }
}

abstract class c extends b{
    c(String name){
        super(name);
        System.out.println(super.name);
        System.out.println(this.name);
        //super ko kaw p mha kaw loh ya
    }
}
