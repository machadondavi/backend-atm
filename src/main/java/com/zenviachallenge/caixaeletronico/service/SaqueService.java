package com.zenviachallenge.caixaeletronico.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class SaqueService {

    public List<Integer> realizarSaque(Integer valorSaque) throws Exception {

        List<Integer> notasSaque = new ArrayList<>();
        List<Integer> notasDisponiveis = new ArrayList<Integer>(Arrays.asList(100, 50, 20, 10));

        for (Integer nota : notasDisponiveis) {
            while (valorSaque >= nota) {
                valorSaque = valorSaque - nota;
                notasSaque.add(nota);
            }
        }

        if(valorSaque != 0) {
            throw new Exception("Valor não disponível para saque");
        }

        return notasSaque;
    }
}
