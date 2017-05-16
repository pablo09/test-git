package com.pzeszko.optional8;

/**
 * Created by Admin on 16.05.2017.
 */
public class NotFoundException extends FakeException {

    public NotFoundException() {
        super("NOT FOUND");
    }
}
