package L2_Encapsulation.UsingPackage;

class MessengerImpl implements Messenger {
    public void send(String message){
        System.out.println("Hello" + message);
    }

    public void greet(){
        System.out.println("Hello");
    }
}
