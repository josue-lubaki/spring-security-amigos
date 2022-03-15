package ca.josue.demo.security;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ApplicationUserRoleTest {
    @Test
    void testGetGrantedAuthorities() {
        assertEquals(1, ApplicationUserRole.STUDENT.getGrantedAuthorities().size());
        assertEquals(5, ApplicationUserRole.ADMIN.getGrantedAuthorities().size());
        assertEquals(3, ApplicationUserRole.ADMINTRAINEE.getGrantedAuthorities().size());
    }
}

