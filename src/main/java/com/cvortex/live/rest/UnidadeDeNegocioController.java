package com.cvortex.live.rest;

import com.cvortex.live.model.UnidadeDeNegocio;
import com.cvortex.live.service.UnidadeDeNegocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/unidades")
public class UnidadeDeNegocioController {

    @Autowired
    private UnidadeDeNegocioService service;

    @GetMapping
    public List<UnidadeDeNegocio> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UnidadeDeNegocio> getById(@PathVariable int id) {
        Optional<UnidadeDeNegocio> unidadeDeNegocio = service.findById(id);
        return unidadeDeNegocio.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public UnidadeDeNegocio create(@RequestBody UnidadeDeNegocio unidadeDeNegocio) {
        return service.save(unidadeDeNegocio);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UnidadeDeNegocio> update(@PathVariable int id, @RequestBody UnidadeDeNegocio unidadeDeNegocio) {
        Optional<UnidadeDeNegocio> existingUnidade = service.findById(id);
        if (existingUnidade.isPresent()) {
            unidadeDeNegocio.setId(id);
            return ResponseEntity.ok(service.save(unidadeDeNegocio));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
