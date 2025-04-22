package com.prueba.pruebasaber.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.prueba.pruebasaber.model.Alumno;


public interface AlumnoRepository extends MongoRepository<Alumno, String> {
    Alumno findByNumeroDocumento(String numeroDocumento);
    
}