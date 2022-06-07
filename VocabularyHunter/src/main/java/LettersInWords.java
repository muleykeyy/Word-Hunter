import java.util.*;

public class LettersInWords {
    public void countLetters(){


        GetSentence getSentence = new GetSentence();
        String sentence = getSentence.getValue();

        String[] splitStr=sentence.split(" ");
        StringTokenizer words = new StringTokenizer(sentence);
        ArrayList<String> wordsInSentence = new ArrayList<String>();
        Map<String,Integer>wordCount=new HashMap<>();




        for(String word:splitStr){

            if(wordCount.containsKey(word)){
                wordCount.put(word, wordCount.get(word)+1);
            }
            else {
                wordCount.put(word,1);
            }






        }

        System.out.println("Number of word: "+wordCount.size());







        for (Map.Entry<String,Integer> entry: wordCount.entrySet()){


            System.out.println("Count of Word: "+entry.getKey()+" in sentence: " +entry.getValue()+" This words have: "+entry.getKey().length()+" charachter");


        }







    }






    }






