package exo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.Instant;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher extends Person{
    private Speciality speciality;

    public double getExamGrade(Exam exam, Student student, Instant t){
        return 0.0;
    }
}
