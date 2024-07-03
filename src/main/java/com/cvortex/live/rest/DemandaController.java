package com.cvortex.live.rest;

import com.cvortex.live.model.Demanda;
import com.cvortex.live.service.DemandaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/demandas")
public class DemandaController {

    @Autowired
    private DemandaService demandaService;

    @GetMapping
    public ResponseEntity<List<Demanda>> listarTodos() {
        List<Demanda> lista = demandaService.listarTodos();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Demanda> buscarPorId(@PathVariable int id) {
        Optional<Demanda> demanda = demandaService.buscarPorId(id);
        return demanda.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Demanda> salvar(@RequestBody Demanda demanda) {
        Demanda novaDemanda = demandaService.salvar(demanda);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaDemanda);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable int id) {
        demandaService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}

