package com.senai.cadastro.interface_ui;

import com.senai.cadastro.application.dto.UsuarioRequestDTO;
import com.senai.cadastro.application.service.UsuarioService;
import com.senai.cadastro.domain.entity.Usuario;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {

    final UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> listAllUsers() {
        return usuarioService.findAll();
    }

    @GetMapping("/{id}")
    public Usuario searchUserById(@PathVariable UUID id) {
        return usuarioService.findById(id);
    }

    @PostMapping
    public Usuario registerUser(@Valid @RequestBody UsuarioRequestDTO usuarioRequestDTO) {
        return usuarioService.save(usuarioRequestDTO);
    }

    @PutMapping("/{id}")
    public Usuario updateUser(@PathVariable UUID id, @Valid @RequestBody UsuarioRequestDTO usuarioRequestDTO) {
        return usuarioService.update(usuarioRequestDTO, id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable UUID id) {
        usuarioService.delete(id);
    }
}