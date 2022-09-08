package day_13;

import java.time.LocalDate;
import java.util.Date;

public class Message {
    private User sender;   // отправитель сообщения
    private User receiver; // получатель сообщения
    private String text;   // текст сообщения
    private LocalDate date;// дата отправки сообщения

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = LocalDate.now();
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "FROM: " + sender +
                "\n'TO: " + receiver +
                "\nON: " + date + '\n' + text;
    }
}