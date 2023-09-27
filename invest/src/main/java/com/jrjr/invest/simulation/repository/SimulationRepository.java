package com.jrjr.invest.simulation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jrjr.invest.simulation.entity.Simulation;

@Repository
public interface SimulationRepository extends JpaRepository<Simulation, Long> {
	Simulation findBySeq(Long seq);

	List<Simulation> findByFinishedDateIsNotNullOrderByRevenuRateDesc();
}
