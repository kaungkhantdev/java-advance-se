package com.astronity.designpattern.mediator;

public class MeditatorDemo {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        User user1 = new User("1", chatRoom);
        User user2 = new User("2", chatRoom);
        User user3 = new User("3", chatRoom);

        user1.send("hello");
    }
}
