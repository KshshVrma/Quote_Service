package com.quote.generator;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/quote")
public class GeneratorController {
    ArrayList<Quote> quotes = new ArrayList<Quote>();
    @GetMapping("/test")
    public String fun(){
    ArrayList<String> test=new ArrayList<String>();
    test.add("Hello");
    test.add("Quote");
    Random random=new Random();


    StringBuilder s=new StringBuilder();

    for(int i=0;i<5;i++){
        s.append("s");
        test.add(s.toString());

    }

        int k=random.nextInt(quotes.size());
        return quotes.get(k).getName();
    }
    @PostMapping("/add")
    public ResponseEntity<String> addItem(@RequestBody Quote item) {
        // Simulate saving the item (e.g., to a database)
        System.out.println("Received item: " + item);
        quotes.add(item);
        // Return a success response
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Item added successfully!");
    }

}

