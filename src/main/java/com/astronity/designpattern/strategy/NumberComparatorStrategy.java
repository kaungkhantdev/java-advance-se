package com.astronity.designpattern.strategy;

public class NumberComparatorStrategy implements ComparableStrategy{
    @Override
    public void compare() {
        System.out.println("Comparing Numbers");
    }
}
