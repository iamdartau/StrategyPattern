package com.company.strategy;

public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num) {
        return num1 * num;
    }
}
