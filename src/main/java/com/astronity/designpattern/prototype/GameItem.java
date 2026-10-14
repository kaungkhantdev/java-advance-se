package com.astronity.designpattern.prototype;

public class GameItem implements Prototype {
    String state;
    int x, y;

    public GameItem(String state, int x, int y) {
        this.state = state;
        this.x = x;
        this.y = y;
    }

    void updatePosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "GameItem [state=" + state + ", x=" + x + ", y=" + y + "]";
    }

    @Override
    public Prototype reproduce() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
