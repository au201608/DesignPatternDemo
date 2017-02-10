package Bridge;

/**
 * Created by thuang on 2/7/17.
 */
public class EmailMessageSender implements MessageSender {
    @Override
    public void sendMessage() {
        System.out.println("EmailMessageSender: Sending email message...");
    }
}
