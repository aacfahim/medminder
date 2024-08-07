package com.ghit.MedicineReminder.database.repository;

import com.ghit.MedicineReminder.database.entity.BaseEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

@NoRepositoryBean
public interface ServiceRepository<E extends BaseEntity> extends JpaRepository<E, String>, JpaSpecificationExecutor<E> {
    Optional<E> findByOidAndIsDeleted(String oid, String isDeleted);

    Page<E> findByIsDeletedOrderByCreatedOnDesc(String isDeleted, Pageable pageable);

    Boolean existsByOidAndIsDeleted(String oid, String isDeleted);

    long countByIsDeleted(String isDeleted);

}
