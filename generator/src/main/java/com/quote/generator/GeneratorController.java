package com.quote.generator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/quote")
public class GeneratorController {
    @GetMapping("/test")
    public String fun(){
    ArrayList<String> test=new ArrayList<String>();
    test.add("Hello");
    test.add("Quote");
    Random random=new Random();
    int k=random.nextInt(test.size());

    StringBuilder s=new StringBuilder();

    for(int i=0;i<5;i++){
        s.append("s");
        test.add(s.toString());

    }


        return test.get(k);
    }

}

