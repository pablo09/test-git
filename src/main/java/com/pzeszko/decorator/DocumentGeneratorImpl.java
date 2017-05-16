package com.pzeszko.decorator;

import java.time.LocalDate;

/**
 * Created by Admin on 15.05.2017.
 */

public class DocumentGeneratorImpl implements DocumentGenerator{
    @Override
    public Document generate(String name) {
        Document document = new Document();

        document.setName(name);
        document.setCreatedOn(LocalDate.now());

        return document;
    }
}
