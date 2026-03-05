package com.example.bankapplication.repository;

import com.example.bankapplication.entity.BankApplicationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BankApplicationRepository extends JpaRepository<BankApplicationEntity,Long> {
    Optional<BankApplicationEntity> findByAccountNumber(String accountNumber);
}
