package test_one;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Messages extends MessagesAbstract{
    private static LinkedList<Message> messages = new LinkedList<>();

    public static LinkedList<Message> getMessages() {
        return messages;
    }

    public static void setMessages(LinkedList<Message> messages) {
        Messages.messages = messages;
    }

    @Override
    public void viewMessage() {

    }

    @Override
    public void deleteMessage() {

    }

    @Override
    public void editMessage() {

    }

    @Override
    public void createMessage() {

    }
}
