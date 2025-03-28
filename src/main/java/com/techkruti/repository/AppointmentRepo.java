package com.techkruti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techkruti.model.Appointment;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Long> {
    
}

