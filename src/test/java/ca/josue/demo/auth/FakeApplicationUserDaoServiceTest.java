package ca.josue.demo.auth;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {FakeApplicationUserDaoService.class})
@ExtendWith(SpringExtension.class)
class FakeApplicationUserDaoServiceTest {
    @Autowired
    private FakeApplicationUserDaoService fakeApplicationUserDaoService;

    @MockBean
    private PasswordEncoder passwordEncoder;

    @Test
    void testApplicationUserByUsername() {
        when(this.passwordEncoder.encode(any())).thenReturn("secret");
        assertFalse(this.fakeApplicationUserDaoService.applicationUserByUsername("janedoe").isPresent());
        verify(this.passwordEncoder, atLeast(1)).encode(any());
    }
}

