package com.mds.demo1.config;

import com.mds.demo1.model.Appointment;
import com.mds.demo1.model.Doctor;
import com.mds.demo1.model.Patient;
import com.mds.demo1.repository.AppointmentRepository;
import com.mds.demo1.repository.DoctorRepository;
import com.mds.demo1.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@RequiredArgsConstructor
public class Data implements CommandLineRunner {

    private final AppointmentRepository appointmentRepository;
    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;

    @Override
    @SneakyThrows
    public void run(String... args) {
        Patient patient1 = new Patient("Adelina", "Adam", "0760099867");
        Patient patient2 = new Patient("Ioana", "Alexa", "0761299827");
        Patient patient3 = new Patient("Mihai", "Dinu", "0761779861");
        Patient patient4 = new Patient("Andrada", "Munteanu", "0761774431");
        Patient patient5 = new Patient("Stefan", "Dragomir", "0761774151");

        patientRepository.save(patient1);
        patientRepository.save(patient2);
        patientRepository.save(patient3);
        patientRepository.save(patient4);
        patientRepository.save(patient5);

        Doctor doctor1 = new Doctor("Elena", "Dobre", "Dermatologie", "0718181425");
        Doctor doctor2 = new Doctor("Liliana", "Florea", "Cardiologie", "0767781869");
        Doctor doctor3 = new Doctor("Ioana", "Cantemir", "Gastroenterologie", "0769180843");
        Doctor doctor4 = new Doctor("Andreea", "Toma", "Oftalomologie", "0725473119");
        Doctor doctor5 = new Doctor("Razvan", "Cristache", "Neurologie", "0752215534");

        doctorRepository.save(doctor1);
        doctorRepository.save(doctor2);
        doctorRepository.save(doctor3);
        doctorRepository.save(doctor4);
        doctorRepository.save(doctor5);

        Appointment appointment1 = new Appointment(patient1, doctor1, LocalDate.of(2023, 2, 12));
        Appointment appointment2 = new Appointment(patient2, doctor2, LocalDate.of(2023, 2, 24));
        Appointment appointment3 = new Appointment(patient3, doctor3, LocalDate.of(2023, 2, 27));
        Appointment appointment4 = new Appointment(patient4, doctor4, LocalDate.of(2023, 3, 7));
        Appointment appointment5 = new Appointment(patient5, doctor5, LocalDate.of(2023, 3, 27));

        appointmentRepository.save(appointment1);
        appointmentRepository.save(appointment2);
        appointmentRepository.save(appointment3);
        appointmentRepository.save(appointment4);
        appointmentRepository.save(appointment5);
    }
}
