package com.astronity.concurrency;

class IncThread extends Thread {
    Data data;
    public IncThread(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++)
        {
            this.data.value += 1;

        }
    }
}
public class MutualExclusion {
    public static void main(String[] args) {
        Data data = new Data();
        IncThread t1 = new IncThread(data);
        IncThread t2 = new IncThread(data);
        IncThread t3 = new IncThread(data);

        t1.start();
        t2.start();
        t3.start();
        System.out.println("Data "+data.value);
    }
}
