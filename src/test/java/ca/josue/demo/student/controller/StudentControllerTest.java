package ca.josue.demo.student.controller;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class StudentControllerTest {
    @Test
    void testGetStudent() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: F009 Internal error.
        //   java.lang.reflect.InaccessibleObjectException: Unable to make field transient java.util.regex.Pattern$Node java.util.regex.Pattern.root accessible: module java.base does not "opens java.util.regex" to unnamed module @313ac989
        //   Please contact Diffblue through the appropriate support channel
        //   (https://www.diffblue.com/support) providing details about this error.

        assertThrows(IllegalStateException.class, () -> (new StudentController()).getStudent(123));
    }

    @Test
    void testGetStudent2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: F009 Internal error.
        //   java.lang.reflect.InaccessibleObjectException: Unable to make field transient java.util.regex.Pattern$Node java.util.regex.Pattern.root accessible: module java.base does not "opens java.util.regex" to unnamed module @313ac989
        //   Please contact Diffblue through the appropriate support channel
        //   (https://www.diffblue.com/support) providing details about this error.

        // TODO: This test is incomplete.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by getStudent(Integer)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        (new StudentController()).getStudent(1);
    }
}

