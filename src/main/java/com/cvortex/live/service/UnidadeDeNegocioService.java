package com.cvortex.live.service;



import com.cvortex.live.model.UnidadeDeNegocio;
import com.cvortex.live.repository.UnidadeDeNegocioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UnidadeDeNegocioService {

    @Autowired
    private UnidadeDeNegocioRepository repository;

    public List<UnidadeDeNegocio> findAll() {
        return repository.findAll();
    }

    public Optional<UnidadeDeNegocio> findById(int id) {
        return repository.findById(id);
    }

    public UnidadeDeNegocio save(UnidadeDeNegocio unidadeDeNegocio) {
        return repository.save(unidadeDeNegocio);
    }

    public void deleteById(int id) {
         repository.deleteById(id);
    }

    // Métodos do serviçox
}
