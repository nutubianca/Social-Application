package com.example.lab.utils.events;

import com.example.lab.domain.Friendship;

public class FriendshipEntityChangeEvent implements Event{
    private ChangeEventType type;
    private Friendship oldData, data;

    public FriendshipEntityChangeEvent(ChangeEventType type, Friendship data)
    {
        this.type=type;
        this.data=data;
    }

    public FriendshipEntityChangeEvent(ChangeEventType type, Friendship oldData, Friendship data) {
        this.type = type;
        this.oldData = oldData;
        this.data = data;
    }

    public ChangeEventType getType() {
        return type;
    }

    public Friendship getOldData() {
        return oldData;
    }

    public Friendship getData() {
        return data;
    }
}
