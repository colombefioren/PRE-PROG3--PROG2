package exo;

import java.util.List;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Student extends Person {
  private String group;
  private Tutor tutor;
  private List<Grade> grades;
}
