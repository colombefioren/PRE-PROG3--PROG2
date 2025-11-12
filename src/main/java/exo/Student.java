package exo;

import java.util.List;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student extends Person {
    private String group;
    private Tutor tutor;
    private List<Grade> grades;
}
