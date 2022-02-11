package com.zenviachallenge.caixaeletronico.controller;

import com.zenviachallenge.caixaeletronico.service.SaqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/saque")
public class SaqueController {

    @Autowired
    private SaqueService saqueService;

    @GetMapping()
    public ResponseEntity<List<Integer>> realizarSaque(@RequestParam Integer valorSaque) throws Exception {
        List<Integer> listaNotas = saqueService.realizarSaque(valorSaque);
        return ResponseEntity.ok().body(listaNotas);
    }
}
