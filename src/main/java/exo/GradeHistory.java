package exo;

import lombok.Data;

import java.time.Instant;

@Data
public class GradeHistory {
    private double grade;
    private Instant dateOfModification;
    private String changeReason;
}
