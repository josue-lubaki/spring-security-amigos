package ca.josue.demo.student.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
public class Student {
    private final Integer studentId;
    public final String studentName;
}
