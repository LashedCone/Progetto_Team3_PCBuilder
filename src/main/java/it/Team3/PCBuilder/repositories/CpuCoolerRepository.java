package it.Team3.PCBuilder.repositories;

import it.Team3.PCBuilder.entity.CpuCooler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CpuCoolerRepository extends JpaRepository<CpuCooler, Integer> {
    Iterable<CpuCooler> findCpuCoolerByCpuSocket(String cpuSocket);

    Iterable<CpuCooler> findCpuCoolerByModel(String model);
    Iterable<CpuCooler> findCpuCoolerByManufacturer(String manufacturer);
}
