package com.astronity.designpattern.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        Text text = new Text.Builder()
                .label("Hello")
                .color("green")
                .decoration("bold")
                .build();

        System.out.println("Text: " + text);
    }
}
