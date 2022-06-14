package com.vocabhunter.VocabHunterSpringBoot.model;

public class Request {
    private String sentence;
    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public Request() {
    }



    public Request(String sentence) {
        this.sentence = sentence;
    }
}
