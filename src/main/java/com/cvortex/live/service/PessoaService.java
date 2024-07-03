package com.cvortex.live.service;


import com.cvortex.live.model.PessoaEntity;
import com.cvortex.live.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<PessoaEntity> listaPessoas() {
        return this.pessoaRepository.findAll();
    }


}
