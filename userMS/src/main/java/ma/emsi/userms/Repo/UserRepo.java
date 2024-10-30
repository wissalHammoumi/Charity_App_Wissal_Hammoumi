package ma.emsi.userms.Repo;

import ma.emsi.userms.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}
