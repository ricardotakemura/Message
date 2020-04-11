package net.ricardo.takemura.message.dto;

import net.ricardo.takemura.message.model.Message;

public class MessageDTO {
    private String text;
    private String sender;

    public MessageDTO(String sender, String text) {
        this.sender = sender;
        this.text = text;
    }

    public MessageDTO() {
        this.sender = "";
        this.text = "";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
