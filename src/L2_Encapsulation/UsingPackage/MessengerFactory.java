package L2_Encapsulation.UsingPackage;

public class MessengerFactory {
    public static Messenger generate(){
        return new MessengerImpl();
    }
}
