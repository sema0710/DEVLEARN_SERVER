package sema.DEVLEARN.entities.user.repository;

import sema.DEVLEARN.entities.user.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User save(User user);
    Optional<User> findById(Integer id);
    Optional<User> findByEmail(String email);
    Optional<User> findByName(String name);
}
