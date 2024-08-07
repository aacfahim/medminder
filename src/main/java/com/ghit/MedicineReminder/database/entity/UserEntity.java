package com.ghit.MedicineReminder.database.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity{

    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;


}
