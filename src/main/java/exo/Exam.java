package exo;

import lombok.Data;

import java.time.Instant;

@Data
public class Exam {
    private int id;
    private String title;
    private Course course;
    private Instant date;
    private double coefficient;
}
