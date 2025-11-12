package exo;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Tutor extends Person{
    private String linkWithStudentDesc;
}
