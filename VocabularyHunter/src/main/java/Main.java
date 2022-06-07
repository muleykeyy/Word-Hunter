import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Hunter hunter =new Hunter();
        Map<String,Integer>FullSentence =hunter.FrequencyOfWord("");
        String a= "fuck you FUCK YOU! very, very. much!";
        System.out.println("Frequency of words: "+hunter.FrequencyOfWord(a));
        System.out.println("Number of words in sentence : "+hunter.NumberOfWords(a));
        Set<Map.Entry<String,Integer>> set=hunter.FrequencyOfWord(a).entrySet();

        for(Map.Entry<String,Integer> entry:set){
            System.out.println("Words "+entry.getKey()+" have "+entry.getKey().length()+" letters");
        }






        }

       /* Main mySentence=new Main();
        mySentence.GetSentence();

    }

    static void GetSentence(){

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence=scan.nextLine();
        System.out.println("Sentence: " +sentence);

    }*/




}