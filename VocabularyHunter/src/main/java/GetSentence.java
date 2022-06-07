import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetSentence {


    public String getValue() {


        System.out.println("Enter a sentence: ");
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        sentence=sentence.toLowerCase();
        sentence=sentence.replaceAll("[.,?'!;_+%&/()=]","");
        return sentence;
    }

}
