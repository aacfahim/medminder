package com.ghit.MedicineReminder.database.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
@Table(name = "roles")
public class Role extends BaseEntity{

    private String name;


}
