package com.cyber.entity;

import com.cyber.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name="employees")
public class Employee extends BaseEntity {

    private String firstName;
    private String lastName;
    private String emailAddress;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private long salary;

    @Column(columnDefinition = "DATE")
    private LocalDate hireDate;
    //private String department;


    @OneToOne(cascade = CascadeType.ALL)
    private Department department;

    @OneToOne(cascade = CascadeType.ALL)
    private  Region region;

    public Employee(String firstName, String lastName, String emailAddress,LocalDate hireDate, Gender gender, long salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.gender = gender;
        this.salary = salary;
        this.hireDate = hireDate;
    }
}
