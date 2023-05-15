package com.portfoliomesdb.mesdb.seguridad.Repository;

import com.portfoliomesdb.mesdb.seguridad.Entity.Rol;
import com.portfoliomesdb.mesdb.seguridad.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
