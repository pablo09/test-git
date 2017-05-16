package com.pzeszko.decorator;

/**
 * Created by Admin on 15.05.2017.
 */
public class DocumentGeneratorDecorator implements DocumentGenerator {

    protected DocumentGenerator generator;

    public DocumentGeneratorDecorator(DocumentGenerator generator) {
        this.generator = generator;
    }

    @Override
    public Document generate(String name) {
        return this.generator.generate(name);
    }
}
