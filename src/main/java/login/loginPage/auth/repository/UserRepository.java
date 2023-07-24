package login.loginPage.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import login.loginPage.auth.model.User;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, String> {
    UserDetails findByLogin(String login);
}