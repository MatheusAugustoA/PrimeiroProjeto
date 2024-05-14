package com.example.atividades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioController3 {
    @GetMapping("fatorial/{numero}")
    public String fatorial(@PathVariable int numero ){
        int fatorial=1;
        for(int i= numero; i>1; i--){
            fatorial*=i;
        }
        return "o fatorial de "+ numero + " é "+ fatorial;
    }
}
