package com.pzeszko.decorator;

/**
 * Created by Admin on 15.05.2017.
 */
public class SignedDocumentGeneratorImpl extends DocumentGeneratorDecorator {

    public SignedDocumentGeneratorImpl(DocumentGenerator generator) {
        super(generator);
    }

    @Override
    public Document generate(String name) {
        Document document = super.generate(name);
        document.setSign("SIGNED");

        return document;
    }
}
