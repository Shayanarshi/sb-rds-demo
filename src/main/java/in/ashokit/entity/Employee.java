package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@NoArgsConstructor
@Data
public class Employee {
    @Id
    private  Integer Empno;

    private String ename;

    private double sal;


    private String department;
}
