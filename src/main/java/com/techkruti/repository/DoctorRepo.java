package com.techkruti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techkruti.model.Doctor;

@Repository
public interface DoctorRepo extends JpaRepository<Doctor, Long> {
    
}

