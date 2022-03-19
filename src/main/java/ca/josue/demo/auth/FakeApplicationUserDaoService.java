package ca.josue.demo.auth;

import ca.josue.demo.security.ApplicationUserRole;
import com.google.common.collect.Lists;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


/**
 * @author Josue Lubaki
 * @version 1.0
 * @since 2022-03-14
 */
@Repository("fake")
@RequiredArgsConstructor
public class FakeApplicationUserDaoService implements ApplicationUserDao {

    private final PasswordEncoder passwordEncoder;

    @Override
    public Optional<ApplicationUser> applicationUserByUsername(String username) {
        return getApplicationUsers()
                .stream()
                .filter(applicationUser -> username.equals(applicationUser.getUsername()))
                .findFirst();
    }

    private List<ApplicationUser> getApplicationUsers() {
        return Lists.newArrayList(
            new ApplicationUser(
                    "josuelubaki",
                    passwordEncoder.encode("password"),
                    ApplicationUserRole.STUDENT.getGrantedAuthorities(),
                    true,
                    true,
                    true,
                    true
            ),
                new ApplicationUser(
                        "annasmith",
                        passwordEncoder.encode("password1234"),
                        ApplicationUserRole.ADMIN.getGrantedAuthorities(),
                        true,
                        true,
                        true,
                        true
                ),
                new ApplicationUser(
                        "jamesbond",
                        passwordEncoder.encode("password1234"),
                        ApplicationUserRole.ADMINTRAINEE.getGrantedAuthorities(),
                        true,
                        true,
                        true,
                        true
                )
        );
    }
}
