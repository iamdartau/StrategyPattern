package com.company.testStrategy;

public class TestContext {

    private TestStrategy strategy;

    public TestContext(TestStrategy strategy) {
        this.strategy = strategy;
    }

    public String executeStrategy(){
        return strategy.findTestWord();
    }

}
