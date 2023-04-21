package web.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.spring.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
