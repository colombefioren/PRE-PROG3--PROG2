package exo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Grade {
    private double initialValue;
    private List<GradeHistory> gradeHistoryList;
    private Exam exam;
    private Student student;
}
