package com.senai.cadastro.application.service;

import com.senai.cadastro.application.dto.UsuarioRequestDTO;
import com.senai.cadastro.application.dto.UsuarioResponseDTO;
import com.senai.cadastro.domain.entity.Usuario;
import com.senai.cadastro.domain.repository.UsuarioRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    final UsuarioRepository usuarioRepository;

    public List<Usuario> findAll() {
        return null;
    }

    public Usuario findById(UUID id) {

        Optional<Usuario> usuarioOpt = usuarioRepository.findById(id);
        if(usuarioOpt.isPresent()) {
            return  usuarioOpt.get();
        } else {
            throw new RuntimeException("Usuário não encontrado");
        }
    }

    public Usuario save(UsuarioRequestDTO usuarioRequestDTO) {
        return usuarioRepository.save(usuarioRequestDTO.toEntity());
    }

    public Usuario update(@Valid UsuarioRequestDTO usuarioRequestDTO, UUID id) {
        Usuario usuarioExistente = findById(id);
        usuarioExistente.setNome(usuarioRequestDTO.nome());
        usuarioExistente.setCpf(usuarioRequestDTO.cpf());
        usuarioExistente.setEmail(usuarioRequestDTO.email());
        usuarioExistente.setSenha(usuarioRequestDTO.senha());

        return usuarioRepository.save(usuarioExistente);
    }

    public void delete(UUID id) {
        usuarioRepository.delete(findById(id));
    }
}