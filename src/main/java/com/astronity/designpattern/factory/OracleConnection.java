package com.astronity.designpattern.factory;

public class OracleConnection implements Connection {

    @Override
    public void open() {
        System.out.println("Oracle Connection opened");
    }

    @Override
    public void close() {
        System.out.println("Oracle Connection closed");
    }
}
