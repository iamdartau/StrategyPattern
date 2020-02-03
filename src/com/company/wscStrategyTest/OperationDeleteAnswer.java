package com.company.wscStrategyTest;

public class OperationDeleteAnswer implements AnswerStrategy {


    @Override
    public String findAnswer(String type) {
        return type;
    }
}
