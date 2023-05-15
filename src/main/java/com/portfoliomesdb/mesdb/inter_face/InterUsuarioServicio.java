package com.portfoliomesdb.mesdb.inter_face;


import com.portfoliomesdb.mesdb.entidad.usuario;
import java.util.List;


public interface InterUsuarioServicio {
   public List<usuario> getusuario();
   
   public void saveusuario(usuario usuario);
   
   public void deleteusuario(Long id);
   
   public usuario findusuario(Long id);
   
}
