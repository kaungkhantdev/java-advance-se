package com.astronity.designpattern.template;

public class OrderController extends FrameworkAction{
    @Override
    void businessLogic() {
        System.out.println("Order processed");
    }

}
