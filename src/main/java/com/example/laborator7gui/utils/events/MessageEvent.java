package com.example.laborator7gui.utils.events;

import com.example.laborator7gui.Domain.Message;

public class MessageEvent  {

    private ChangeEventType type;
    private Message message, oldMessage;

    public MessageEvent(ChangeEventType type, Message message) {
        this.type = type;
        this.message = message;
    }
    public MessageEvent(ChangeEventType type, Message message, Message oldMessage) {
        this.type = type;
        this.message = message;
        this.oldMessage = oldMessage;
    }

    public ChangeEventType getType() {
        return type;
    }

    public Message getMessage() {
        return message;
    }

    public Message getOldMessage() {
        return oldMessage;
    }

}
