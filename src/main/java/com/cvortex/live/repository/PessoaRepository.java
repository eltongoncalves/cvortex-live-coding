package com.cvortex.live.repository;

import com.cvortex.live.model.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository  extends JpaRepository<PessoaEntity, Integer> {
}
