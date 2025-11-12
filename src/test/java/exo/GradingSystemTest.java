package exo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradingSystemTest {

  Tutor tutor;
  Student student;
  Teacher teacher;
  Exam exam1;
  Exam exam2;
  Exam exam3;
  Course course1;
  Course course2;
  Grade grade1;
  Grade grade2;
  Grade grade3;

  @BeforeEach
  void setUp() {
    tutor =
        Tutor.builder()
            .id(1)
            .firstName("Domoina")
            .lastName("Rakoto")
            .email("domoina@gmail.com")
            .dateOfBirth(LocalDate.of(1986, 6, 10))
            .linkWithStudentDesc("Mother-daughter")
            .phoneNumber("06-12-34-56-78")
            .build();

    teacher =
        Teacher.builder()
            .id(1)
            .firstName("Shakira")
            .lastName("Oleyy")
            .email("shakira@gmail.com")
            .dateOfBirth(LocalDate.of(1980, 6, 15))
            .phoneNumber("06-12-34-56-78")
            .speciality(Speciality.FRONT_END)
            .build();

    course1 = Course.builder().id(1).label(Label.MGT1).credit(4).teacher(teacher).build();

    course2 = Course.builder().id(2).label(Label.PROG1).credit(6).teacher(teacher).build();

    exam1 =
        Exam.builder()
            .id(1)
            .title("First exam of PROG1")
            .coefficient(2)
            .date(Instant.now())
            .course(course2)
            .build();

    exam2 =
        Exam.builder()
            .id(2)
            .title("Second exam of PROG1")
            .coefficient(3)
            .date(Instant.now())
            .course(course2)
            .build();

    exam3 =
        Exam.builder()
            .id(2)
            .title("First exam of MGT1")
            .coefficient(3)
            .date(Instant.now())
            .course(course1)
            .build();

    student =
        Student.builder()
            .id(1)
            .firstName("Coco")
            .lastName("Rakoto")
            .email("coco@gmail.com")
            .dateOfBirth(LocalDate.of(2007, 4, 7))
            .phoneNumber("06-12-34-56-78")
            .group("K1")
            .tutor(tutor)
            .build();

    GradeHistory gradeHistory1 =
        GradeHistory.builder()
            .grade(11.0)
            .dateOfModification(Instant.parse("2025-11-10T00:00:00Z"))
            .changeReason("Initial grade")
            .build();

    GradeHistory gradeHistory2 =
        GradeHistory.builder()
            .grade(10.0)
            .dateOfModification(Instant.parse("2025-11-11T00:00:00Z"))
            .changeReason("The answer to the first question is wrong!")
            .build();

    GradeHistory gradeHistory3 =
        GradeHistory.builder()
            .grade(15.0)
            .dateOfModification(Instant.parse("2025-11-11T00:00:00Z"))
            .changeReason("Initial grade")
            .build();

    grade1 =
        Grade.builder()
            .exam(exam1)
            .gradeHistoryList(new ArrayList<>(Arrays.asList(gradeHistory1, gradeHistory2)))
            .student(student)
            .build();

    grade2 =
        Grade.builder()
            .exam(exam2)
            .gradeHistoryList(new ArrayList<>(List.of(gradeHistory3)))
            .student(student)
            .build();

    grade3 = Grade.builder().exam(exam3).initialValue(18).student(student).build();

    student.setGrades(List.of(grade1, grade2, grade3));
  }

  @Test
  void should_return_the_correct_grade_for_a_given_date_and_hour() throws Exception {
    assertEquals(11, grade1.getGradeByInstant(Instant.parse("2025-11-10T00:00:00Z")));
    assertEquals(10, grade1.getGradeByInstant(Instant.parse("2025-11-11T00:00:00Z")));
  }

  @Test
  void should_return_the_correct_grade_for_a_given_exam_student_date_and_hour() throws Exception {
    assertEquals(10, teacher.getExamGrade(exam1, student, Instant.parse("2025-11-11T00:00:00Z")));
    assertEquals(15, teacher.getExamGrade(exam2, student, Instant.parse("2025-11-11T00:00:00Z")));
  }

  @Test
  void should_return_the_final_grade_for_a_given_course_student_date_and_hour() throws Exception {
    assertEquals(
        13, teacher.getCourseGrade(course2, student, Instant.parse("2025-11-11T00:00:00Z")));
  }
}
