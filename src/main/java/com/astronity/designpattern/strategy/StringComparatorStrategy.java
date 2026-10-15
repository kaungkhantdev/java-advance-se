package com.astronity.designpattern.strategy;

public class StringComparatorStrategy implements ComparableStrategy {
    @Override
    public void compare() {
        System.out.println("Comparing Strings");
    }
}
