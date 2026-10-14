package com.astronity.designpattern.factory;

public class MysqlFactory implements ConnectionFactory {
    @Override
    public Connection openConnection() {
        return new MysqlConnection();
    }
}
