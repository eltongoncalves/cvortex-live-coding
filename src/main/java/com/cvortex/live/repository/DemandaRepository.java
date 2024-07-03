package com.cvortex.live.repository;

import com.cvortex.live.model.DemandaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemandaRepository extends JpaRepository<DemandaEntity, Integer> {
}
