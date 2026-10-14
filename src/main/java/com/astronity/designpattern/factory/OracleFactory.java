package com.astronity.designpattern.factory;

public class OracleFactory implements ConnectionFactory {
    @Override
    public Connection openConnection() {
        return new OracleConnection();
    }
}
