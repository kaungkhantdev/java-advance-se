package com.astronity.designpattern.adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        // class
        Api api = new ClassAdapter();

        // object adatper
        api = new ObjectAdapter();
        api.api();
    }
}
