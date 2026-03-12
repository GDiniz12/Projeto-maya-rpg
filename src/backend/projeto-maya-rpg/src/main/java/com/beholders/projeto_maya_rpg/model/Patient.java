package com.beholders.projeto_maya_rpg.model;

import jakarta.persistence.Entity;

@Entity
public class Patient {
    String name;
    String email;
    String password;
    int phoneNumber;
}
