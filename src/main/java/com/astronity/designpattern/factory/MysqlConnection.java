package com.astronity.designpattern.factory;

public class MysqlConnection implements Connection {
    @Override
    public void open() {
        System.out.println("Mysql Connection opened");
    }

    @Override
    public void close() {
        System.out.println("Mysql Connection closed");
    }
}
