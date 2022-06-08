package com.vocabhunter.VocabHunterSpringBoot;

import org.example.app.Hunter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;
import java.util.Set;


@SpringBootApplication
public class VocabHunterSpringBootApplication {

	public static void main(String[] args) {

		Hunter hunter = new Hunter();

		Map<String,Integer> FullSentence =hunter.FrequencyOfWord("");
		String a= "HiLal! müleyke. MÜLEYKE, yükSel hiLaL";
		System.out.println("Frequency of words: "+hunter.FrequencyOfWord(a));
		System.out.println("Number of words in sentence : "+hunter.NumberOfWords(a));
		Set<Map.Entry<String,Integer>> set=hunter.FrequencyOfWord(a).entrySet();

		for(Map.Entry<String,Integer> entry:set){
			System.out.println("Words "+entry.getKey()+" have "+entry.getKey().length()+" letters");
		}






	}

}
