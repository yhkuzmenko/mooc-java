public class Main {

    public static void main(String[] args) {
        MessagingService messages = new MessagingService();

        messages.add(new Message("John", "asd"));
        messages.add(new Message("Mike", "zxc"));

        System.out.println("Messages:");
        for (Message message : messages.getMessages()) {
            System.out.println(message);
        }
    }
}