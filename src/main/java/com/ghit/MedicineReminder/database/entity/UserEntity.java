package com.ghit.MedicineReminder.database.entity;
import ch.qos.logback.core.subst.Token;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity{

    private String name;

    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;




}
