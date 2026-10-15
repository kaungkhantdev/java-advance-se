package com.astronity.designpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);

        Range range = new Range(0, 6);
        Iterator<Integer> iterator = list.iterator();
        //iterator = list.iterator();
        /*
		while(iterator.hasNext())
		{
			System.out.println("Next "+iterator.next());
		}
        */

        for(Integer item : range)
        {
            System.out.println("Item "+item);
        }
    }
}
