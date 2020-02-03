package com.company.strategy;

import com.company.testStrategy.TestContext;
import com.company.testStrategy.TestDoMyNameIs;
import com.company.testStrategy.TestDoSlimShady;
import com.company.testStrategy.TestDoTextHi;
import com.company.wscStrategyTest.AnswerContext;
import com.company.wscStrategyTest.OperationDeleteAnswer;
import com.company.wscStrategyTest.OperationFindLowSpeedType;

public class Main {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationDivision());
        System.out.println("10 / 5 = " + context.executeStrategy(10, 5));

        AnswerContext answerContext = new AnswerContext(new OperationDeleteAnswer());
        System.out.println(answerContext.executeStrategy("Answer was deleted"));

        answerContext = new AnswerContext(new OperationFindLowSpeedType());
        System.out.println(answerContext.executeStrategy("Low Speed beeyaach"));

        TestContext testContext = new TestContext(new TestDoTextHi());
        System.out.println(testContext.executeStrategy());

        testContext = new TestContext(new TestDoMyNameIs());
        System.out.println(testContext.executeStrategy());

        testContext = new TestContext(new TestDoSlimShady());
        System.out.println(testContext.executeStrategy());



    }
}
