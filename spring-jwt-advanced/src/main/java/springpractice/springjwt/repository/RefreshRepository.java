package springpractice.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import springpractice.springjwt.domain.RefreshEntity;

public interface RefreshRepository extends JpaRepository<RefreshEntity,Long> {
    Boolean existsByRefresh(String refresh);
    @Transactional
    void deleteByRefresh(String refresh);
}
