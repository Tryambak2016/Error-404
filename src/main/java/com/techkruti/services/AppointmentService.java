package com.techkruti.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.techkruti.model.Appointment;
import com.techkruti.repository.AppointmentRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AppointmentService {
    
    private final AppointmentRepo appointmentRepository;

    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    public void bookAppointment(Appointment appointment) {
        appointmentRepository.save(appointment);
    }
}

