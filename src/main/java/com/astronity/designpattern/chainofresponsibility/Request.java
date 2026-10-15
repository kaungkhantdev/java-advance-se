package com.astronity.designpattern.chainofresponsibility;

public class Request extends HttpMessage {
    String url;

    public String getUrl() {
        return url;
    }

    public String setUrl(String url) {
        return this.url = url;
    }
}
