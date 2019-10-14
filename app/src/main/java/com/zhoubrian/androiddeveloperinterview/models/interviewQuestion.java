package com.zhoubrian.androiddeveloperinterview.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class interviewQuestion {

    public UUID qsn_id;
    public String Question;
    public String Answer;
    public List<String> suggestions;
    public String explanation;

    public interviewQuestion(){};

    public interviewQuestion(String question, String answer) {
        this.qsn_id=UUID.randomUUID();
        Question = question;
        Answer = answer;
        suggestions=new ArrayList<>();
    }

    public interviewQuestion(String question, String answer, List<String> suggestions) {
        this.qsn_id=UUID.randomUUID();
        Question = question;
        Answer = answer;
        this.suggestions = suggestions;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public UUID getQsn_id() {
        return qsn_id;
    }

    public void setQsn_id(UUID qsn_id) {
        this.qsn_id = qsn_id;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }

    public List<String> getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(List<String> suggestions) {
        this.suggestions = suggestions;
    }
}//end of interviewQuestion
