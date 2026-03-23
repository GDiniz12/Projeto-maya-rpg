package com.beholders.projeto_maya_rpg.repository;

import com.beholders.projeto_maya_rpg.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
