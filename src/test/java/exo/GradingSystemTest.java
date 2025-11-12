package exo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class GradingSystemTest {

  @BeforeEach
  void setUp() {
    Tutor tutor = Tutor.builder().id().linkWithStudentDesc("Mother-daughter").build();
  }
}
