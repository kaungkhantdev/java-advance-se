package com.astronity.designpattern.chainofresponsibility;

public interface Handler {
    void handle(Request request, Response response);
}
