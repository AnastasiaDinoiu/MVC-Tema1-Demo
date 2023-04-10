package com.mds.demo1.controller;

import com.mds.demo1.repository.AppointmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class AppointmentController {

    private final AppointmentRepository appointmentRepository;

    @GetMapping(path = "clinic/appointments")
    public String getAppointments(Model model) {
        model.addAttribute("appointments", appointmentRepository.findAll());

        return "appointments";
    }
}
