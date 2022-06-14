package com.vocabhunter.VocabHunterSpringBoot.model;

import java.util.HashMap;
import java.util.Map;

public class Response {
    Map<String ,Integer>Frequency=new HashMap<>();
    //Map<String,Integer> FullSentence=new HashMap<>();
    Map<String,Integer> lengthOfWords=new HashMap<>();
    int numberOfWords;

    public Map<String, Integer> getLengthOfWords() {
        return lengthOfWords;
    }

    public void setLengthOfWords(Map<String, Integer> lengthOfWords) {
        this.lengthOfWords = lengthOfWords;
    }



    public int getNumberOfWords() {
        return numberOfWords;
    }

    public void setNumberOfWords(int numberOfWords) {
        this.numberOfWords = numberOfWords;
    }









    public Map<String, Integer> getFrequency() {
        return Frequency;
    }

    public void setFrequency(Map<String, Integer> frequency) {
        Frequency = frequency;
    }







    public Response() {
    }



}
