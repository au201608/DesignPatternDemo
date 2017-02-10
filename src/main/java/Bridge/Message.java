package Bridge;

/**
 * Created by thuang on 2/7/17.
 */
public abstract class Message {
    MessageSender messageSender;

    public Message(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    abstract public void send();
}
