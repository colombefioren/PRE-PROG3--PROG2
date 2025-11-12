package exo;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Person {
  private int id;
  private String firstName;
  private String lastName;
  private Date dateOfBirth;
  private String email;
  private String phoneNumber;
}
