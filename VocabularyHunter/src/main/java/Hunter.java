import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Hunter {

    public int NumberOfWords(String sentence) {

        StringTokenizer words = new StringTokenizer(sentence);
        ArrayList<String> wordsInSentence = new ArrayList<String>();

        while (words.hasMoreTokens()) {

            wordsInSentence.add(words.nextToken());

        }

        return wordsInSentence.size();


    }

    public Map<String, Integer> FrequencyOfWord(String sentence) {

        sentence = sentence.replaceAll("[.,?'!;_+%&/()=]", "");
        sentence = sentence.toLowerCase();

        String[] splitStr = sentence.split(" ");

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : splitStr) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }


        }
        return wordCount;


    }




}

















 /*GetSentence getSentence = new GetSentence();
        String sentence = getSentence.getValue();
        ArrayList<String> wordsInSentence = new ArrayList<String>();
        StringTokenizer words = new StringTokenizer(sentence);

        while (words.hasMoreTokens()) {
            wordsInSentence.add(words.nextToken());

        }
        System.out.println("Number of words in sentence: " + wordsInSentence.size());

        for (int i = 0; i < wordsInSentence.size(); i++) {
            //System.out.println("Words in sentence: " + wordsInSentence.get(i)+ " This words have "+wordsInSentence.get(i).length()+" charachter");
        }



        return wordsInSentence;

    }

    public void Occurrence(){
        GetSentence getSentence = new GetSentence();
        String sentence = getSentence.getValue();
        sentence=sentence.toLowerCase();
        String[] splitStr=sentence.split(" ");


        Map<String,Integer>wordCount=new HashMap<>();

        for(String word:splitStr){
            if(wordCount.containsKey(word)){
                wordCount.put(word, wordCount.get(word)+1);
            }
            else {
                wordCount.put(word,1);
            }
        }

        for (Map.Entry<String,Integer> entry: wordCount.entrySet()){
            System.out.println("Count of Word: "+entry.getKey()+" in sentence: " +entry.getValue()+" This words have: "+entry.getKey().length()+" charachter");
            }*/

























/*
        if(sentence==null || sentence.isEmpty()){
            return wordsInSentence;
        }

        StringTokenizer words=new StringTokenizer(sentence);
        System.out.println("Number of words in sentence: "+ words.countTokens());

        while (words.hasMoreTokens()){
            //System.out.println("Words in the sentence: "+words.nextToken());

            wordsInSentence.add(words.nextToken());
            System.out.println("Words in the sentence: "+wordsInSentence);
        }

        //int size= wordsInSentence.size();
        System.out.println("Charachter number in sentence: " + wordsInSentence.size()); */
