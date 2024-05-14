package com.example.atividades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioController {

    @GetMapping("binToDec/{binario}")
    public String binarioParaDecimal(@PathVariable String binario){
        int valDecimal = 0;
        for (int i = binario.length() - 1; i >= 0; i--) {
            if (binario.charAt(i) == '1') {
                valDecimal += Math.pow(2, i);
            }

        }
        return valDecimal+"";
    }
}
