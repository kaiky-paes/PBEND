package com.example.cadastro;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/usuario")
public class UsuarioController {

    final UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Usuario> listarTodosUsuarios() {
        return usuarioRepository.findAll();
    }

    /*@GetMapping("/{id}")
    public Usuario buscarUsuarioId(@PathVariable UUID id) {
        Optional<Usuario> usuarioOpt =
        return usuarioRepository.findById(id);
    }*/

    @PostMapping
    public Usuario cadastrarUsuario(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @PutMapping("/{id}")
    public Usuario atualizarUsuario(@PathVariable UUID id, @RequestBody Usuario usuario) {
        Optional<Usuario> usuarioOpt = usuarioRepository.findById(id);

        if (usuarioOpt.isPresent()) {
            Usuario usuarioAtualizado = usuarioOpt.get();
            usuarioAtualizado.setNome(usuario.getNome());
            usuarioAtualizado.setCpf(usuario.getCpf());
            usuarioAtualizado.setEmail(usuario.getEmail());
            return usuarioRepository.save(usuarioAtualizado);
        } else {
            throw new RuntimeException("Usuário não encontrado com o ID: " + id);
        }
    }

    @DeleteMapping("/{id}")
    public void removerUsuario (@PathVariable UUID id) {
        Optional<Usuario> usuarioOpt = usuarioRepository.findById(id);
        if (usuarioOpt.isPresent()) {
            usuarioRepository.deleteById(id);
        } else {
            throw new RuntimeException("Usuário não encontrado com o ID: " + id);
        }
    }
}