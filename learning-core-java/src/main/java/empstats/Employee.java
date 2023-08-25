package empstats;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee {
    private int empno;
    private String firstName;
    private String lastName;
    private String email;
    private double salary;
}
