package com.company.testStrategy;

public class TestDoMyNameIs implements TestStrategy {
    @Override
    public String findTestWord() {
        return "My name is";
    }
}
