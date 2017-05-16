package com.pzeszko.decorator;

/**
 * Created by Admin on 15.05.2017.
 */
public class TestGenerator extends DocumentGeneratorImpl  {

    public Document generate1(String name) {
        Document doc = generate(name);
        doc.setSign("SIGNED3");

        return doc;
    }
}
