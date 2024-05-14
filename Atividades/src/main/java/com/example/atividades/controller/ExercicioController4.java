package com.example.atividades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioController4 {
@GetMapping("palindromo")
    public String verificaPalavra(@PathVariable String palavra){
    String palavraInvertida = "";
    for(int i = palavra.length()-1; i>= 0; i--){
        palavraInvertida += palavra.charAt(i);
    }
    if(palavra.equals(palavraInvertida)){
        return "É um palíndromo";
    }else{
        return "Não é um palíndromo";
    }
}

  }



