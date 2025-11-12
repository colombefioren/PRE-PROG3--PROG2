package exo;

import lombok.Data;

import java.time.Instant;

@Data
public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private Instant dateOfBirth;
    private String email;
    private String phoneNumber;
}
