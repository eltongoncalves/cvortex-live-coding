package com.cvortex.live.service;

import com.cvortex.live.model.Demanda;
import com.cvortex.live.repository.DemandaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DemandaService {

    @Autowired
    private DemandaRepository demandaRepository;

    public List<Demanda> listarTodos() {
        return demandaRepository.findAll();
    }

    public Optional<Demanda> buscarPorId(int id) {
        return demandaRepository.findById(id);
    }

    public Demanda salvar(Demanda demanda) {
        return demandaRepository.save(demanda);
    }

    public void deletar(int id) {
        demandaRepository.deleteById(id);
    }
}

