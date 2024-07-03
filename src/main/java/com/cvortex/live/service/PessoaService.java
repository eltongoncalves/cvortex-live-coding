package com.cvortex.live.service;

import com.cvortex.live.model.Pessoa;
import com.cvortex.live.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> listarTodos() {
        return pessoaRepository.findAll();
    }

    public Optional<Pessoa> buscarPorId(int id) {
        return pessoaRepository.findById(id);
    }

    public Pessoa salvar(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public void deletar(int id) {
        pessoaRepository.deleteById(id);
    }
}

