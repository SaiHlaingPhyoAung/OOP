package L8_Nested_Class;

public class L1_UsageOfNestedClass {

    private int num ;

    /*
    why we used nested class
    Class 1ku yk method mr return 1ku pl pyn loh ya loh
    return 2ku 3ku pyn chin yin (Constructor htl hte p return 2ku kaw) nested class ko tone
     */

    /*
    Main class yk Instance variable ko access lod poh
    ma lo bu so Static Class ko tone
    lo to so Inner Class ko tone
     */

    //Inner Static Class
    public static class InnerStatic {
        public void showMessage(){
            System.out.println("This is Static Inner Class");
        }
    }

    //Inner Class
    public class Inner{
        public void showMessage(){
            System.out.println("This is Inner Class" + num);
        }
    }
}
