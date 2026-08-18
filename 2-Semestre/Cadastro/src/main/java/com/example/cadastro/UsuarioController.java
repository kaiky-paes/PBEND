package com.example.cadastro;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    @GetMapping
    public ArrayList<Usuario> listarTodosUsuarios() {
        return listaUsuarios;
    }

    @GetMapping("/{id}")
    public Usuario buscarUsuarioId(@PathVariable int id) {
        return listaUsuarios.get(id);
    }

    @PostMapping
    public Usuario cadastrarUsuario(@RequestBody Usuario usuario) {
        listaUsuarios.add(usuario);
        return listaUsuarios.getLast();
    }

    @PutMapping("/{id}")
    public Usuario atualizarUsuario(@PathVariable int id, @RequestBody Usuario usuario) {
        listaUsuarios.set(id,usuario);
        return listaUsuarios.get(id);
    }

    @DeleteMapping("/{id}")
    public void removerUsuario (@PathVariable int id) {
        listaUsuarios.remove(id);
    }
}