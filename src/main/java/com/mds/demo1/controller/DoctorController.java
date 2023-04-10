package com.mds.demo1.controller;

import com.mds.demo1.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class DoctorController {

    private final DoctorRepository doctorRepository;

    @GetMapping(path = "clinic/doctors")
    public String getDoctors(Model model) {
        model.addAttribute("doctors", doctorRepository.findAll());

        return "doctors";
    }
}
