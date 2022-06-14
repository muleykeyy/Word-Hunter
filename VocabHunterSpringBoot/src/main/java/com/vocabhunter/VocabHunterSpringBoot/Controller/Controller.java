package com.vocabhunter.VocabHunterSpringBoot.Controller;

import com.vocabhunter.VocabHunterSpringBoot.model.Request;
import com.vocabhunter.VocabHunterSpringBoot.model.Response;
import org.example.app.Hunter;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@CrossOrigin(origins = "http://localhost:8080")
@RestController

@RequestMapping("/getSentence")
public class Controller {

    @PostMapping("/sentence")
    public Response GetSentence(@RequestBody Request request){

        Hunter hunter = new Hunter();
        Response response=new Response();
        Map<String,Integer>LengthMap=new HashMap<>();
        response.setFrequency(hunter.FrequencyOfWord(request.getSentence()));
        response.setNumberOfWords(hunter.NumberOfWords(request.getSentence()));
        Set<Map.Entry<String,Integer>> set=hunter.FrequencyOfWord(request.getSentence()).entrySet();
        for(Map.Entry<String,Integer> entry:set){

            LengthMap.put(entry.getKey(), entry.getKey().length());
        }

        response.setLengthOfWords(LengthMap);





        return response;


    }


}
