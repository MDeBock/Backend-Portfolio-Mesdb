package com.portfoliomesdb.mesdb.servicio;

import com.portfoliomesdb.mesdb.entidad.usuario;
import com.portfoliomesdb.mesdb.inter_face.InterUsuarioServicio;
import com.portfoliomesdb.mesdb.repositorio.InterUsuarioRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ImpUsuarioServicio implements InterUsuarioServicio{
    @Autowired InterUsuarioRepositorio IusuarioRepositorio;    

    @Override
    public List<usuario> getusuario() {
      List<usuario> usuarios = IusuarioRepositorio.findAll();
      return usuarios;
    }

    @Override
    public void saveusuario(usuario usuarios) {
        IusuarioRepositorio.save(usuarios);
    }

    @Override
    public void deleteusuario(Long id) {
        IusuarioRepositorio.deleteById(id);
    }

    @Override
    public usuario findusuario(Long id) {
        usuario usuarios = IusuarioRepositorio.findById(id).orElse(null);
        return usuarios;
    }

    
    
}
