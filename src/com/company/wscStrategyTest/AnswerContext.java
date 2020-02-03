package com.company.wscStrategyTest;

public class AnswerContext {

    private AnswerStrategy answerStrategy;

    public AnswerContext(AnswerStrategy answerStrategy) {
        this.answerStrategy = answerStrategy;
    }

    public String executeStrategy(String type){
        return answerStrategy.findAnswer(type);
    }

}
