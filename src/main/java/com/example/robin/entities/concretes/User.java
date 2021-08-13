package com.example.robin.entities.concretes;

import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;

    @Column(name = "user_name")
    @NotNull
    private String userName;
    @Column(name = "password")
    @NotNull
    private String password;
}
