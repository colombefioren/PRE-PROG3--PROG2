package exo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Grade {
    private double initialValue;
    private GradeHistory gradeHistory;
    private Exam exam;
    private Student student;
}
