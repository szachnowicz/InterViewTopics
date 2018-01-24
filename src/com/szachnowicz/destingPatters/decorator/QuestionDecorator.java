package com.szachnowicz.destingPatters.decorator;

public abstract class QuestionDecorator implements IQuestion {
    public IQuestion question;

    public QuestionDecorator(IQuestion question) {
        this.question = question;
    }

    @Override
    public void display(QuestionContent questionContent) {
        question.display(questionContent);
    }
}
