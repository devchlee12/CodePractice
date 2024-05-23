package springpractice.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springpractice.springjwt.domain.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
    boolean existsByUsername(String username);

    UserEntity findByUsername(String username);
}
