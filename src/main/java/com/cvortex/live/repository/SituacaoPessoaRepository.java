package com.cvortex.live.repository;

import com.cvortex.live.model.SituacaoPessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SituacaoPessoaRepository extends JpaRepository<SituacaoPessoa, Integer> {
}

