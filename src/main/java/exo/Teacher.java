package exo;

import java.time.Instant;
import java.util.List;
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

  public double getCourseGrade(Course course, Student student, Instant t) throws Exception {
    List<Grade> courseGradeList =
        student.getGrades().stream()
            .filter(grade -> grade.getExam().getCourse().equals(course))
            .toList();

    double totalCourseGrade = 0;
    double totalCoeff = 0;
    for (Grade grade : courseGradeList) {
      totalCourseGrade += grade.getGradeByInstant(t) * grade.getExam().getCoefficient();
      totalCoeff += grade.getExam().getCoefficient();
    }

    return totalCourseGrade / totalCoeff;
  }
}
