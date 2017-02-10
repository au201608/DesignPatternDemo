package BridgeTest;

import Bridge.*;
import org.junit.Test;

/**
 The objective of the bridge pattern is to identify how to realize relationships between classes and objects in a simple
 way. The bridge pattern does it by separating the abstraction and the implementation in separate class hierarchies.
 The bridge between the class hierarchies is achieved through composition.
 */
public class MessageTest {
    @Test
    public void testSend() throws Exception {
        MessageSender textMessageSender = new TextMessageSender();
        Message textMessage = new TextMessage(textMessageSender);
        textMessage.send();

        MessageSender emailMessageSender = new EmailMessageSender();
        Message emailMessage = new EmailMessage(emailMessageSender);
        emailMessage.send();
    }
}
