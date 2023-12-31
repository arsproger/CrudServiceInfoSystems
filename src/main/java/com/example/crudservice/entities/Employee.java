package com.example.crudservice.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String homePhone;
    private String mobilePhone;
    private String workPhone;
    private String homeAddress;
    private String webpage;
    private String bankDetails;
    private String position;

    @ManyToOne
    @JoinColumn(name = "organization_id", referencedColumnName = "id")
    private Organization organization;
}