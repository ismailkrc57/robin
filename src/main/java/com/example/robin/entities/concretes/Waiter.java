package com.example.robin.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "waiters")
@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Waiter extends User {

    @NotNull
    @NotBlank(message = "isim alanı boş olamaz")
    @Column(name = "name")
    private String name;

    @NotNull
    @NotBlank(message = "soyad alanı boş olamaz")
    @Column(name = "surname")
    private String surname;

    @NotNull
    @NotBlank(message = "telefonn alanı boş olamaz")
    @Column(name = "phone_number")
    private String phoneNumber;
}
