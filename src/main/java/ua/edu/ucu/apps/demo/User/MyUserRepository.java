package ua.edu.ucu.apps.demo.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface MyUserRepository extends JpaRepository<MyUser, Integer> {
    @Query("SELECT u FROM MyUser u WHERE u.email = ?1")
    Optional<MyUser> findMyUserByEmail(String email);
}
