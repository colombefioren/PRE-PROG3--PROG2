package exo;

import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Exam {
  private int id;
  private String title;
  private Course course;
  private Instant date;
  private double coefficient;
}
