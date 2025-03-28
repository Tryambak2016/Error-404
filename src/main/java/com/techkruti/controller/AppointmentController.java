package com.techkruti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techkruti.model.Appointment;
import com.techkruti.services.AppointmentService;
import com.techkruti.services.DoctorService;
import com.techkruti.services.PatientService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/appointments")
@RequiredArgsConstructor
public class AppointmentController {
    
    private final AppointmentService appointmentService;
    
    
    private final PatientService patientService;
    
  
    private final DoctorService doctorService;

    @GetMapping
    public String showAppointments(Model model) {
        model.addAttribute("appointments", appointmentService.getAllAppointments());
        model.addAttribute("patients", patientService.getAllPatients());
        model.addAttribute("doctors", doctorService.getAllDoctors());
        model.addAttribute("newAppointment", new Appointment());
        return "appointment";
    }

    @PostMapping("/book")
    public String bookAppointment(@ModelAttribute("newAppointment") Appointment appointment) {
        appointmentService.bookAppointment(appointment);
        return "redirect:/appointments";
    }
}

