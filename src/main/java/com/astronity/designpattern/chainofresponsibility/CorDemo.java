package com.astronity.designpattern.chainofresponsibility;

public class CorDemo {
    public static void main(String[] args) {
        Framework framework = new Framework();
        framework.addHandler(new LoggingHandler());
        framework.addHandler(new AuthHandler());
        framework.addHandler(new RequestController());

        Request req = new Request();
        req.setUrl("http://localhost/api");
        req.addHeader("Authorization", "Bearer jwtoken_alkdjf");
        Response res = new Response();

        framework.processRequest(req, res);
    }
}
