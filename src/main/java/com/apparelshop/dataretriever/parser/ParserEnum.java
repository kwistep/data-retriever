package com.apparelshop.dataretriever.parser;

public enum ParserEnum {

    /**
     *  supported parsers
     */
    ADIDAS("adidas");


    ParserEnum(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }
}
