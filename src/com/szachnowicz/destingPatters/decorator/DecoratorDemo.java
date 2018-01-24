package com.szachnowicz.destingPatters.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {

        QuestionContent questionContent = new QuestionContent("Czy można na ulicy",12);
        questionContent.addQuestion("tak");
        questionContent.addQuestion("nie");

        IQuestion textTest = new TextTest();
        IQuestion imageQuestion = new ImageQuestionDecorator(new TextTest());


        textTest.display(questionContent);

        imageQuestion.display(questionContent);


    }
}


