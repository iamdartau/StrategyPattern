package com.company.strategy;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num){
        return strategy.doOperation(num1, num);
    }
}
