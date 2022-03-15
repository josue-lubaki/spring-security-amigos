package ca.josue.demo.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;

import org.junit.jupiter.api.Test;
import org.springframework.security.core.GrantedAuthority;

class ApplicationUserTest {
    @Test
    void testConstructor() {
        HashSet<GrantedAuthority> grantedAuthoritySet = new HashSet<>();
        ApplicationUser actualApplicationUser = new ApplicationUser("janedoe", "iloveyou", grantedAuthoritySet, true, true,
                true, true);

        assertSame(grantedAuthoritySet, actualApplicationUser.getAuthorities());
        assertEquals("iloveyou", actualApplicationUser.getPassword());
        assertEquals("janedoe", actualApplicationUser.getUsername());
        assertTrue(actualApplicationUser.isAccountNonExpired());
        assertTrue(actualApplicationUser.isAccountNonLocked());
        assertTrue(actualApplicationUser.isCredentialsNonExpired());
        assertTrue(actualApplicationUser.isEnabled());
    }
}

