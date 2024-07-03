package com.cvortex.live.rest;

import com.cvortex.live.model.SituacaoPessoa;
import com.cvortex.live.service.SituacaoPessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/situacao-pessoa")
public class SituacaoPessoaController {

    @Autowired
    private SituacaoPessoaService situacaoPessoaService;

    @GetMapping
    public ResponseEntity<List<SituacaoPessoa>> listarTodos() {
        List<SituacaoPessoa> lista = situacaoPessoaService.listarTodos();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SituacaoPessoa> buscarPorId(@PathVariable int id) {
        Optional<SituacaoPessoa> situacaoPessoa = situacaoPessoaService.buscarPorId(id);
        return situacaoPessoa.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<SituacaoPessoa> salvar(@RequestBody SituacaoPessoa situacaoPessoa) {
        SituacaoPessoa novaSituacaoPessoa = situacaoPessoaService.salvar(situacaoPessoa);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaSituacaoPessoa);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable int id) {
        situacaoPessoaService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}

