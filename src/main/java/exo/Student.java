package exo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Student extends Person {
    private String group;
    private Tutor tutor;
}
