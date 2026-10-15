package com.astronity.designpattern.strategy;

public class SortingAlgorithm {
    ComparableStrategy strategy;

    void setStrategy(ComparableStrategy strategy) {
        this.strategy = strategy;
    }

    void sort()
    {
        System.out.println("Sorting Algorithm with strategy");
        this.strategy.compare();
    }
}
