package com.libcode.ChillStudy.ChillStudy.RegistroAcademico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libcode.ChillStudy.ChillStudy.RegistroAcademico.entities.RegistroAcademico;

@Repository
public interface  RegistroAcademicoRepository extends JpaRepository<RegistroAcademico, Long>{
    
}
