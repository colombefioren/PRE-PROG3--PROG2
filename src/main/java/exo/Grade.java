package exo;

import java.time.Instant;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Grade {
  private double initialValue;
  private List<GradeHistory> gradeHistoryList;
  private Exam exam;
  private Student student;

  public double getGradeByInstant(Instant instant) throws Exception {
    return gradeHistoryList.stream()
        .filter(gradeHistory -> gradeHistory.getDateOfModification().equals(instant))
        .findFirst()
        .map(GradeHistory::getGrade)
        .orElseThrow(() -> new Exception("No grade found for instant: " + instant));
  }

  public void updateGrade(double newGrade, String changeReason){
    gradeHistoryList.add(new GradeHistory(newGrade, Instant.now(), changeReason));
  }
}
