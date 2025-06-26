package com.school.student_service.entity;

import jakarta.persistence.*;
import lombok.*;

/*
 * student entity modeling
 */
@Entity
@Table(name = "students")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    private Long schoolId;
}
