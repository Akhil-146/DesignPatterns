import Builder.Message;
import Builder.MessageType;

public class BuilderClient {
    public static void main(String[] args) throws Exception {
        Message newMessage = Message.getBuilder()
                .setMessageType(MessageType.TEXT)
                .setSender("Akhil")
                .setRecipient("World")
                .setContent("Hello World.....")
                .build();

        System.out.println("Message Sent: " +newMessage.toString());
    }
}
