package exo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Exam {
    private int id;
    private String title;
    private Course course;
    private Instant date;
    private double coefficient;
}
