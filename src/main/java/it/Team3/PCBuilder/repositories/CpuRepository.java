package it.Team3.PCBuilder.repositories;

import it.Team3.PCBuilder.entity.Cpu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface CpuRepository extends JpaRepository<Cpu, Integer> {
    Iterable<Cpu> findByManufacturer(String manufacturer);

    Optional<Cpu> findByPart(String part);

    Iterable<Cpu> findBySocket(String socket);
}