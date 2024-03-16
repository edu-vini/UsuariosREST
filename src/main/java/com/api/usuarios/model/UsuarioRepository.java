package com.api.usuarios.model;

import com.api.usuarios.handler.BusinessException;
import com.api.usuarios.handler.RequiredFieldException;
import com.api.usuarios.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario){
        if(usuario.getUsername() == null){
            throw new RequiredFieldException("username");
        }
        System.out.printf( "Salvando usuario %s, no sistema... \n", usuario.getUsername() );
    }

    public Usuario get(String username){
        return new Usuario(username,"123456");
    }

    public List<Usuario> getAll(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Vinicius","123456"));
        usuarios.add(new Usuario("Adriano","123456"));
        usuarios.add(new Usuario("Russean","123456"));

        return usuarios;
    }

    public void delete(String username){
        System.out.printf( "Deletando usuario %s, no sistema... \n", username );
    }
}
