package com.cvortex.live.service;

import com.cvortex.live.model.SituacaoPessoa;
import com.cvortex.live.repository.SituacaoPessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class SituacaoPessoaService {

    @Autowired
    private SituacaoPessoaRepository situacaoPessoaRepository;

    public List<SituacaoPessoa> listarTodos() {
        return situacaoPessoaRepository.findAll();
    }

    public Optional<SituacaoPessoa> buscarPorId(int id) {
        return situacaoPessoaRepository.findById(id);
    }

    public SituacaoPessoa salvar(SituacaoPessoa situacaoPessoa) {
        return situacaoPessoaRepository.save(situacaoPessoa);
    }

    public void deletar(int id) {
        situacaoPessoaRepository.deleteById(id);
    }
}
