package it.Team3.PCBuilder.repositories;

import it.Team3.PCBuilder.entity.Motherboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotherboardRepository extends JpaRepository<Motherboard, Integer> {
	Iterable<Motherboard> findMotherboardBySocket(String socket);

	Iterable<Motherboard> findMotherboardByManufacturer(String manufacturer);

	Iterable<Motherboard> findMotherboardByFormFactor(String formFactor);
}