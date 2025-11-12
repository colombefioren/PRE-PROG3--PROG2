package exo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;

public class GradingSystemTest {

  @BeforeEach
  void setUp() {
    Tutor tutor =
        Tutor.builder()
            .id(1)
            .firstName("Domoina")
            .lastName("Rakoto")
            .email("domoina@gmail.com")
            .dateOfBirth(LocalDate.of(1986, 6, 10))
            .linkWithStudentDesc("Mother-daughter")
            .build();
  }
}
