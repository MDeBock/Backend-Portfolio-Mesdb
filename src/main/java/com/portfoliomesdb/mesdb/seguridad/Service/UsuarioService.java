
package com.portfoliomesdb.mesdb.seguridad.Service;

import com.portfoliomesdb.mesdb.entidad.User;
import com.portfoliomesdb.mesdb.seguridad.Repository.IUsuarioRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    IUsuarioRepository iusuariorepository;
    
    public Optional<User> getByNombreUsuario(String nombreUsuario){
        return iusuariorepository.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreusuario(String nombreUsuario){
        return iusuariorepository.existsByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByEmail(String email){
        return iusuariorepository.existsByEmail(email);
    }
    
    public void save(User usuario){
        iusuariorepository.save(usuario);
    }
            
}
