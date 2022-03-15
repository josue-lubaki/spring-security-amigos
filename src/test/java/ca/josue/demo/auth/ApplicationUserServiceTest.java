package ca.josue.demo.auth;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {ApplicationUserService.class})
@ExtendWith(SpringExtension.class)
class ApplicationUserServiceTest {
    @MockBean(name = "fake")
    private ApplicationUserDao applicationUserDao;

    @Autowired
    private ApplicationUserService applicationUserService;

    @Test
    void testLoadUserByUsername() throws UsernameNotFoundException {
        ApplicationUser applicationUser =
                new ApplicationUser(
                        "janedoe",
                        "iloveyou",
                        new HashSet<>(),
                        true,
                        true,
                        true,
                        true
                );

        when(this.applicationUserDao.applicationUserByUsername(any())).thenReturn(Optional.of(applicationUser));
        assertSame(applicationUser, this.applicationUserService.loadUserByUsername("janedoe"));
        verify(this.applicationUserDao).applicationUserByUsername(any());
    }

    @Test
    void testLoadUserByUsername2() throws UsernameNotFoundException {
        when(this.applicationUserDao.applicationUserByUsername(any())).thenReturn(Optional.empty());
        assertThrows(UsernameNotFoundException.class, () -> this.applicationUserService.loadUserByUsername("janedoe"));
        verify(this.applicationUserDao).applicationUserByUsername(any());
    }

    @Test
    void testLoadUserByUsername3() throws UsernameNotFoundException {
        when(this.applicationUserDao.applicationUserByUsername(any()))
                .thenThrow(new UsernameNotFoundException("Username %s not found"));
        assertThrows(UsernameNotFoundException.class, () -> this.applicationUserService.loadUserByUsername("janedoe"));
        verify(this.applicationUserDao).applicationUserByUsername(any());
    }
}

