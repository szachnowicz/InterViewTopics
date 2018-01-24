package com.szachnowicz.destingPatters.decorator;

import java.util.LinkedList;
import java.util.List;

public class QuestionContent {
    public String questionText;
    public List<String> asnswers;
    public long questionId;

    public QuestionContent(String questionText, long questionId) {
        this.questionText = questionText;
        this.questionId = questionId;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }

    public List<String> getAsnswers() {
        return asnswers;
    }

    public void addQuestion(String questionText) {
        if (asnswers == null) {
            asnswers = new LinkedList<>();
        }
    }
}
