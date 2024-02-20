package com.example.laborator7gui.utils.events;


import com.example.laborator7gui.Domain.Entity;
import com.example.laborator7gui.Domain.User;

public class UserTaskChangeEvent implements Event {
    private ChangeEventType type;
    private Entity data, oldData;

    public UserTaskChangeEvent(ChangeEventType type, Entity data) {
        this.type = type;
        this.data = data;
    }
    public UserTaskChangeEvent(ChangeEventType type, User data, User oldData) {
        this.type = type;
        this.data = data;
        this.oldData=oldData;
    }

    public ChangeEventType getType() {
        return type;
    }

    public Entity getData() {
        return data;
    }

    public Entity getOldData() {
        return oldData;
    }
}