package com.astronity.designpattern.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

public class Framework {
    List<Handler> handlers = new ArrayList<>();

    void addHandler(Handler handler) {
        handlers.add(handler);
    }

    void removeHandler(Handler handler) {
        handlers.remove(handler);
    }

    void processRequest(Request request, Response response) {
        try {
            for (Handler handler : handlers) {
                handler.handle(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
