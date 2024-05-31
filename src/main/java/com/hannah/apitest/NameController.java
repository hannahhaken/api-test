package com.hannah.apitest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class NameController {
    List<String> names = new ArrayList<>();

    public NameController() {
        names.add( "Debbie");
    }

    @GetMapping( "/names")
    public List<String> getNames() {
       return names;
    }

    @PostMapping("/name")
    public void addName(@RequestBody String name) {
        names.add(name);
    }
}
