package com.portfoliomesdb.mesdb.repositorio;


import com.portfoliomesdb.mesdb.entidad.usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface InterUsuarioRepositorio extends JpaRepository<usuario,Long>{

    public usuario findAllById(Long id); 
    
}
