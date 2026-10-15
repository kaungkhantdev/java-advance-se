package com.astronity.designpattern.observer;

import java.util.Observer;

public interface Publisher {
    void attach(Subscriber subscriber);
    void detach(Subscriber subscriber);
    void change(String message);
}
