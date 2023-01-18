package L6_Interface;

public class Class {
    public static void main(String[] args) {
        System.out.println(Inter.Non_Final);
        System.out.println(Inter.num);
        System.out.println(Inter.intFinal);

    }
}
interface Inter {

    /*
    Why interface
    Abstract class ka (Deadly dead of diamond) kyg 1ku pl extend lod loh ya loh interface ko tone
     */

    //Variable
    //Instance variable (No)
    //Static variable (No)
    //Constructor (No)

    //Static final variable (Yes) auto pyit
    public static final int intFinal = 10;
    public static int Non_Final = 8;
    int num = 10;



    /*
    Variable
    Interface hte mr Variable ka Static ma yay htr lal Static pyit
    Public ma yay htr lal Public pyit
    Final ma yay htr lal Final pyit
    Interface hte mr Constructor yay loh ma ya

    Method
    static method yay loh ya (Allow from java 8)
    instance method yay loh ma ya
    public Abstract method so yay loh ya
    private concrete method yay loh ya (java 9)
    private void doAction(){}
     */

}



