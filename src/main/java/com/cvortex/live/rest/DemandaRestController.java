package com.cvortex.live.rest;


import com.cvortex.live.model.DemandaEntity;
import com.cvortex.live.model.PessoaEntity;
import com.cvortex.live.service.DemandaService;
import com.cvortex.live.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("demandas")
public class DemandaRestController {


    @Autowired
    private DemandaService service;

    @GetMapping("/")
    public ResponseEntity<List<DemandaEntity>> listarDemandas() {
        return ResponseEntity.ok(service.listarDemandas());
    }

    @PostMapping("/{idDemanda}/atribuir-pessoa/{idPessoa}")
    public  ResponseEntity<DemandaEntity> atribuirDemanda(
        @PathVariable int idDemanda,
        @PathVariable int idPessoa
    ) throws Exception {
        return ResponseEntity.ok(service.atribuirDemanda(idDemanda, idPessoa));
    }



}
