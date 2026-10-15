package com.astronity.designpattern.template;

public class PaymentController extends FrameworkAction {
    @Override
    void businessLogic() {
        System.out.println("Payment processed");
    }
}
