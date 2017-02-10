package Bridge;

/**
 * Created by thuang on 2/7/17.
 */
public class TextMessageSender implements MessageSender {
    @Override
    public void sendMessage() {
        System.out.println("TextMessageSender: Sending text message...");
    }
}
