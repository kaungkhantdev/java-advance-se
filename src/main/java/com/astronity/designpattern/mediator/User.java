package com.astronity.designpattern.mediator;

public class User implements ChatUser {
    ChatRoom chatRoom;
    String id;

    User(String id, ChatRoom chatRoom)
    {
        this.id = id;
        this.chatRoom = chatRoom;
        this.chatRoom.addUser(this);
    }

    @Override
    public void send(String message) {
        System.out.println("User " + id + " sends message: " + message);
        this.chatRoom.send(this, message);
    }

    @Override
    public void receive(String message) {
        System.out.println("User " + id + " receives message: " + message);
    }
}
