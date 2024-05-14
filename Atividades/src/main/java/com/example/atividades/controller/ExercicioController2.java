package com.example.atividades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.lang.invoke.SwitchPoint;

@RestController
public class ExercicioController2 {
    @GetMapping("romToDec/{romanos}")
    public String converteRomanosParaDecimal(@PathVariable String romanos) {
        int valDecimal = 0;
        for (int i = 0; i < romanos.length(); i++) {
            switch (romanos.charAt(i)){
                case 'I':
                    valDecimal += 1;
                    break;

                case 'V':
                    valDecimal += 5;
                    break;

                case 'X':
                    valDecimal += 10;
                    break;

            }
        }
        return valDecimal + "";
    }
}

