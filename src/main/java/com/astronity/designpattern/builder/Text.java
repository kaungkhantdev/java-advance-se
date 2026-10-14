package com.astronity.designpattern.builder;

public class Text {
    String label;
    String color;
    String font;
    Integer size;
    String decoration;

    @Override
    public String toString() {
        return "Text{" +
                "label='" + label + '\'' +
                ", color='" + color + '\'' +
                ", font='" + font + '\'' +
                ", size=" + size +
                ", decoration='" + decoration + '\'' +
                '}';
    }

    public Text(Builder builder) {
        super();
        this.label = builder.label;
        this.color = builder.color;
        this.font = builder.font;
        this.size = builder.size;
        this.decoration = builder.decoration;
    }

    public static class Builder {
        String label;
        String color;
        String font;
        Integer size;
        String decoration;

        Builder() {}

        Builder label(String label) {
            this.label = label;
            return this;
        }

        Builder color(String color) {
            this.color = color;
            return this;
        }

        Builder font(String font) {
            this.font = font;
            return this;
        }

        Builder size(Integer size) {
            this.size = size;
            return this;
        }

        Builder decoration(String decoration) {
            this.decoration = decoration;
            return this;
        }

        Text build() {
            return new Text(this);
        }
    }
}
