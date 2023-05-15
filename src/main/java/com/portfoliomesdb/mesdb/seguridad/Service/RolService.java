
package com.portfoliomesdb.mesdb.seguridad.Service;

import com.portfoliomesdb.mesdb.seguridad.Entity.Rol;
import com.portfoliomesdb.mesdb.seguridad.Enums.RolNombre;
import com.portfoliomesdb.mesdb.seguridad.Repository.RolRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    RolRepository rolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);       
        
    }
    
    public void save(Rol rol){
        rolRepository.save(rol);
    }
}
