package ca.josue.demo.student;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Student {
    private final Integer studentId;
    public final String studentName;
}
