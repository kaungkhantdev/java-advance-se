package com.astronity.designpattern.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Logger logger = new HtmlDecorator(new BasicLogger());
        Logger logger2 = new TimeDecorator(logger);
        System.out.println(logger.log("hello"));
        System.out.println(logger2.log("hello decorator"));
    }
}
