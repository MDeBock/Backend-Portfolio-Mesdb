
package com.portfoliomesdb.mesdb.seguridad.Repository;

import com.portfoliomesdb.mesdb.entidad.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<User, Integer>{
    Optional<User> findByNombreUsuario(String nombreUsuario);
    
    boolean existsByNombreUsuario(String NombreUsuario);
    boolean existsByEmail(String email);
    
}
