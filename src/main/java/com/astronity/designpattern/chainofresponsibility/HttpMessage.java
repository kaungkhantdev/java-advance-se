package com.astronity.designpattern.chainofresponsibility;

import java.util.HashMap;

public class HttpMessage {
    HashMap<String, String> headers = new HashMap<>();

    void addHeader(String key, String value) {
        headers.put(key, value);
    }

    String getHeader(String key) {
        return this.headers.get(key);
    }
}
