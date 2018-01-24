package com.szachnowicz.destingPatters.decorator;

public class TextTest implements IQuestion {

    @Override
    public void display(QuestionContent questionContent) {
        System.out.println(questionContent.getQuestionText());
        questionContent.getAsnswers().forEach(System.out::println);
    }
}
