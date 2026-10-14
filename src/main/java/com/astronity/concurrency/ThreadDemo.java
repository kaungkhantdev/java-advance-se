package com.astronity.concurrency;

class CountPrinter extends Thread {
    String name;
    public CountPrinter(String name) {
        super(name);
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread "+this.name + " i=> "+i);
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        CountPrinter c1 = new CountPrinter("one");
        CountPrinter c2 = new CountPrinter("two");
        CountPrinter c3 = new CountPrinter("three");

        c1.start();
        c2.start();
        c3.start();
    }
}
