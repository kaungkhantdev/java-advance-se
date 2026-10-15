package com.astronity.designpattern.chainofresponsibility;

public class AuthHandler implements Handler {
    @Override
    public void handle(Request request, Response response) {
        String token = request.getHeader("Authorization");

        if (token != null) System.out.println("Auth OK");
        else throw new RuntimeException("Auth Error");
    }
}
