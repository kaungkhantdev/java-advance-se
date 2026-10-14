package com.astronity.designpattern.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        ConnectionFactory factory = new MysqlFactory();
        Connection connection = factory.openConnection();
        connection.open();
        connection.close();

        factory = new OracleFactory();
        connection = factory.openConnection();
        connection.open();
        connection.close();
    }
}
