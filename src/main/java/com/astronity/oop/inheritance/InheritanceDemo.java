package com.astronity.oop.inheritance;

class Window98 {
    void start() {
        System.out.println("Window start");
    }
    void shutdown() {
        System.out.println("Window shutdown");
    }
    void  close() {
        System.out.println("Window close");
    }

    void screenSaver() {
        System.out.println("Window screen saver");
    }
}

class Window20 extends Window98 {
    void addAni() {
        System.out.println("Window add ani");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Window20 window = new Window20();
        window.start();
        window.shutdown();
        window.close();
        window.addAni();

    }
}
