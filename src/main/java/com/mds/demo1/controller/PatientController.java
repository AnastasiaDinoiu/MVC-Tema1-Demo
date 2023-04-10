package com.mds.demo1.controller;

import com.mds.demo1.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class PatientController {

    private final PatientRepository patientRepository;

    @GetMapping(path = "clinic/patients")
    public String getPatients(Model model) {
        model.addAttribute("patients", patientRepository.findAll());

        return "patients";
    }
}
