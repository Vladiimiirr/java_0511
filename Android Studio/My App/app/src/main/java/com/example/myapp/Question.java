package com.example.myapp;

public class Question {
    private int questionResId; // в переменной лежит id вопроса
    private  boolean answerTrue; // какой должен быть ответ

    public Question (int questionResId, boolean answerTrue){
        this.questionResId =questionResId;
        this.answerTrue =answerTrue;
    }
    public int getQuestionResId() {return questionResId;}
    public boolean isAnswerTrue() {return answerTrue;}

}
