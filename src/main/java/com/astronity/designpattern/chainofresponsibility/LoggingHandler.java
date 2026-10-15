package com.astronity.designpattern.chainofresponsibility;

import java.util.Date;

public class LoggingHandler implements Handler {
    @Override
    public void handle(Request request, Response response) {
        System.out.println(new Date()+" Log "+request.url);
    }
}
