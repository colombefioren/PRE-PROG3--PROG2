package exo;

import lombok.Data;

@Data
public class Grade {
    private double initialValue;
    private GradeHistory gradeHistory;
    private Exam exam;
    private Student student;
}
