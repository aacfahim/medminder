package com.ghit.MedicineReminder.database.entity;
import ch.qos.logback.core.subst.Token;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
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

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "oid"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "oid"))
    private List<Role> roles = new ArrayList<>();





}
