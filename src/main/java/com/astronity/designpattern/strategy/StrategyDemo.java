package com.astronity.designpattern.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        SortingAlgorithm sortingAlgorithm = new SortingAlgorithm();

        sortingAlgorithm.setStrategy(new NumberComparatorStrategy());
        sortingAlgorithm.sort();

        sortingAlgorithm.setStrategy(new StringComparatorStrategy());
        sortingAlgorithm.sort();
    }
}
