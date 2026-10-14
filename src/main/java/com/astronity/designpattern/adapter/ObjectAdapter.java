package com.astronity.designpattern.adapter;

public class ObjectAdapter implements Api {
    OldApi api = new OldApi();
    @Override
    public void api() {
        api.oldApi();
    }
}
