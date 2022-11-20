package ua.edu.ucu.apps.demo.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<MyUser, Integer> {

    Optional<MyUser> findMyUserByEmail(String email);
}
