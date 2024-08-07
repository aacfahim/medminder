package com.ghit.MedicineReminder.database.repository;

import com.ghit.MedicineReminder.database.entity.UserEntity;

import java.util.Optional;

public interface AuthRepository extends ServiceRepository<UserEntity> {

    Optional<UserEntity> findByEmailAndIsDeleted(String email, String isDeleted);
}
