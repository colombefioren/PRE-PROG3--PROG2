package exo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Teacher extends Person{
    private Speciality speciality;
}
