package com.example.demo.repositories;
import com.example.demo.models.produto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface produtoRepositories extends JpaRepository<produto, Long>{
}