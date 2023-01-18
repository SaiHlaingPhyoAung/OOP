package L8_Nested_Class;

public class L2_Accessing_Nested_Class {
    //Inner Static Class
    public static class InnerStatic {
        public void showMessage(){
            System.out.println("This is Static Inner Class");
        }
    }

    //Inner Class
    public class Inner{
        public void showMessage(){
            System.out.println("This is Inner Class");
        }
    }

    //calling from static methods
    public static void staticMessage(){
        InnerStatic obj1= new InnerStatic();
        obj1.showMessage();
    }

    //calling from instance methods
    public void showMessage(){
        InnerStatic obj = new InnerStatic();
        obj.showMessage();

        Inner obj2 = new Inner();
        obj2.showMessage();
    }
}

class show{
    public static void main(String[] args) {

        //Static Nested Class
        L2_Accessing_Nested_Class.InnerStatic obj = new L2_Accessing_Nested_Class.InnerStatic();
        obj.showMessage();

        //Inner Class (2Ways)
        //be careful New                                                      **
        L2_Accessing_Nested_Class.Inner obj2 = new L2_Accessing_Nested_Class().new Inner();
        obj2.showMessage();

        //Second ways
        L2_Accessing_Nested_Class object = new L2_Accessing_Nested_Class();
        L2_Accessing_Nested_Class.Inner obj3 = object.new Inner();
        obj3.showMessage();


    }
}
