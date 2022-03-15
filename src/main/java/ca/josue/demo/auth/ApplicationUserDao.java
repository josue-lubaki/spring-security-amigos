package ca.josue.demo.auth;

import java.util.Optional;

/**
 * @author Josue Lubaki
 * @version 1.0
 * @since 2022-03-14
 */
public interface ApplicationUserDao {
    Optional<ApplicationUser> applicationUserByUsername(String username);
}
