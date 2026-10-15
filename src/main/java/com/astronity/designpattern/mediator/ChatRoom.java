package com.astronity.designpattern.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    List<ChatUser> users = new ArrayList<>();

    void addUser(ChatUser user)
    {
        users.add(user);
    };
    void removeUser(ChatUser user)
    {
        users.remove(user);
    };

    void send(ChatUser sender, String message)
    {
        for(ChatUser u : users)
        {
            if (u != sender) u.receive(message);
        }
    }
}
