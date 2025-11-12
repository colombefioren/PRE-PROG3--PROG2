package exo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Tutor extends Person{
    private String linkWithStudentDesc;
}
