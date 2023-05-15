package com.portfoliomesdb.mesdb.controlador;

import com.portfoliomesdb.mesdb.entidad.usuario;
import com.portfoliomesdb.mesdb.inter_face.InterUsuarioServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class UsuarioControlador {
    @Autowired InterUsuarioServicio iusuarioServicio;
   
    @GetMapping("usuarios/traer")
    public List<usuario> getusuario(){
        return iusuarioServicio.getusuario();
        
    }
    
    @PostMapping("/usuarios/crear")
    public String createusuario(@RequestBody usuario usuarios){
        iusuarioServicio.saveusuario(usuarios);
        return "Usuario creado correctamente";
    }
    
    @DeleteMapping("/usuarios/borrar/(id)")
    public String deleteususario(@PathVariable Long id){
        iusuarioServicio.deleteusuario(id);
        return "Usuario eliminado correctamente";
    }
    
    @PutMapping("/usuarios/editar/(id)")
    public usuario editusuario(@PathVariable Long id, 
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("apellido") String nuevoApellido,
            @RequestParam("img") String nuevoImg){
        usuario usuarios = iusuarioServicio.findusuario(id);
        usuarios.setNombre(nuevoNombre);
        usuarios.setApellido(nuevoApellido);
        usuarios.setImg(nuevoImg);
        iusuarioServicio.saveusuario(usuarios);
        return usuarios;
    }
    
@GetMapping("/usuarios/traer/perfil")
    public usuario findusuario(){
        return iusuarioServicio.findusuario((long)1);
                
    }
    
}