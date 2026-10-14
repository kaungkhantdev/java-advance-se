package com.astronity.concurrency;

class IncrementThread extends Thread {
    Data data;
    IncrementThread(Data data) {
        this.data = data;
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (data) {
                this.data.value += 1;
            }
        }
    }
}

public class SolveMutualExclusion {
    public static void main(String[] args) {
        Data data = new Data();
        IncrementThread thread1 = new IncrementThread(data);
        IncrementThread thread2 = new IncrementThread(data);
        IncrementThread thread3 = new IncrementThread(data);

        thread1.start();
        thread2.start();
        thread3.start();

        try {

            thread1.join();
            thread2.join();
            thread3.join();

            System.out.println("Data "+data.value);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
