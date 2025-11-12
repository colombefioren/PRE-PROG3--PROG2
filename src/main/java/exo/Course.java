package exo;

import lombok.Data;

@Data
public class Course {
    private int id;
    private String label;
    private double credit;
    private Teacher teacher;
}
