
package com.portfoliomesdb.mesdb.seguridad.Service;

import com.portfoliomesdb.mesdb.entidad.User;
import com.portfoliomesdb.mesdb.entidad.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailImpl implements UserDetailsService{
    @Autowired
    UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        User usuario = usuarioService.getByNombreUsuario(nombreUsuario).get(); 
        return UserPrincipal.build(usuario);
    }
}
