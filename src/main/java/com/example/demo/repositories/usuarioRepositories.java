package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.usuario;

public interface usuarioRepositories extends JpaRepository<usuario, Long> {
}
