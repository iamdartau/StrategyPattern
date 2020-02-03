package com.company.strategy;

public class OperationDivision implements Strategy {
    @Override
    public int doOperation(int num1, int num) {
        return num1/num;
    }
}
