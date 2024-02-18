package com.cydeo.entity;

import com.cydeo.enums.Gender;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "students")
public class Student{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "studentFirstName")
    private String firstName;
    @Column(name = "studentLastName")
    private String lastName;
    private String  email;

    @Transient
    private String age;

    @Column(columnDefinition = "Date")
    private LocalDate birthDate;
    @Column(columnDefinition = "Time")
    private LocalTime birthTime;
    @Column(columnDefinition = "Timestamp")
    private LocalDate birthDateTime;
    @Enumerated(EnumType.STRING)
    private Gender gender;
}
