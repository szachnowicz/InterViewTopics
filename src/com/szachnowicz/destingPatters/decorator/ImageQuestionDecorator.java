package com.szachnowicz.destingPatters.decorator;

public class ImageQuestionDecorator extends QuestionDecorator {
    public ImageQuestionDecorator(IQuestion question) {
        super(question);
    }

    @Override
    public void display(QuestionContent questionContent) {
        System.out.println("Image test");
        question.display(questionContent);
    }
}
