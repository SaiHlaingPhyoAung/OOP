package L2_Encapsulation;

import L2_Encapsulation.UsingPackage.Messenger;
import L2_Encapsulation.UsingPackage.MessengerFactory;

public class MessengerDemo {
    public static void main(String[] args) {
        Messenger m = MessengerFactory.generate();
        m.send("Hello java");
    }
}
