package ca.josue.demo.student.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StudentTest {
    @Test
    void testConstructor() {
        Student actualStudent = new Student(123, "Student Name");

        assertEquals(123, actualStudent.getStudentId().intValue());
        assertEquals("Student Name", actualStudent.getStudentName());
    }
}

