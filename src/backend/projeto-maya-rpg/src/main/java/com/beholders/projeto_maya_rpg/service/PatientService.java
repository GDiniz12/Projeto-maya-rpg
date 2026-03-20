package com.beholders.projeto_maya_rpg.service;

import com.beholders.projeto_maya_rpg.exception.ResourceNotFoundException;
import com.beholders.projeto_maya_rpg.model.Patient;
import com.beholders.projeto_maya_rpg.repository.PatientRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Page<Patient> getAll(Pageable pageable) {
        return patientRepository.findAll(pageable);
    }

    public Patient getById(Long id) {
        return patientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Patient not found with id: " + id));
    }

    @Transactional
    public Patient save(Patient patient) {
        return patientRepository.save(patient);
    }

    @Transactional
    public void delete(Long id) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Patient not found with id: " + id));
        patientRepository.delete(patient);
    }

    @Transactional
    public Patient update(Long id, Patient updatedPatient) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Patient not found with id: " + id));

        patient.setName(updatedPatient.getName());
        patient.setEmail(updatedPatient.getEmail());
        patient.setPhoneNumber(updatedPatient.getPhoneNumber());
        patient.setStatus(updatedPatient.getStatus());
        patient.setBirthDate(updatedPatient.getBirthDate());

        return patientRepository.save(patient);
    }

    @Transactional
    public void updatePassword(Long id, String newPasswordHash) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Patient not found with id: " + id));
        patient.setPasswordHash(newPasswordHash);
        patientRepository.save(patient);
    }
}