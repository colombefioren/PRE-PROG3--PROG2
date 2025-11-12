package exo;

import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher extends Person {
  private Speciality speciality;

  public double getExamGrade(Exam exam, Student student, Instant t) throws Exception {
    return student.getGrades().stream()
        .filter(grade -> grade.getExam().equals(exam))
        .findFirst()
        .map(
            grade -> {
              try {
                return grade.getGradeByInstant(t);
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
            })
        .orElseThrow(() -> new Exception("No grade found for exam " + exam + " at instant " + t));
  }
}
