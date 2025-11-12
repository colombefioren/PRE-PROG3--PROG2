package exo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GradeHistory {
    private double grade;
    private Instant dateOfModification;
    private String changeReason;
}
