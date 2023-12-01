package it.Team3.PCBuilder.user;

import it.Team3.PCBuilder.admin.security.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);


    Iterable<User> findByRole(Role role);

    Optional<User> findByUsernameOrEmail(String username, String email);
}