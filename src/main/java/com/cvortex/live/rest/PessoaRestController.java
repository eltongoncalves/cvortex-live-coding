package com.cvortex.live.rest;


import com.cvortex.live.model.PessoaEntity;
import com.cvortex.live.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("pessoa")
public class PessoaRestController {


    @Autowired
    private PessoaService service;

    @GetMapping("/")
    public ResponseEntity<List<PessoaEntity>> listarPessoas() {
        return ResponseEntity.ok(service.listaPessoas());
    }



}
