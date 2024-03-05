package com.api.usuarios.controller;

import com.api.usuarios.model.Usuario;
import com.api.usuarios.model.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @GetMapping
    public List<Usuario> getAll(){
        return usuarioRepository.getAll();
    }
    @GetMapping("/{username}")
    public Usuario get(@PathVariable("username") String username){
        return usuarioRepository.get(username);
    }
    @PostMapping
    public void save(@RequestBody Usuario usuario){
        Usuario novoUsuario = new Usuario(usuario.getUsername(),usuario.getPassword());
        usuarioRepository.save(novoUsuario);
    }
    @PutMapping
    public void update(@RequestBody Usuario usuario){
        usuarioRepository.save(usuario);
    }
    @DeleteMapping("/{username}")
    public void delete(@PathVariable("username")String username){
        usuarioRepository.delete(username);
    }

}
