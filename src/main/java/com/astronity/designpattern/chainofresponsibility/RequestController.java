package com.astronity.designpattern.chainofresponsibility;

public class RequestController implements Handler {
    @Override
    public void handle(Request request, Response response) {
        System.out.println("Request is handled by controller");
    }
}
