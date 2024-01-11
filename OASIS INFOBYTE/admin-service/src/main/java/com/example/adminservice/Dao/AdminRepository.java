package com.example.adminservice.Dao;

import com.example.adminservice.entity.AdminAccess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Optional;

@EnableJpaRepositories
public interface AdminRepository extends JpaRepository<AdminAccess,Integer> {


    public Optional<AdminAccess> findAdminByAdminEmail(final String adminEmail);
}
