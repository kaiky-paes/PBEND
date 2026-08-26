package com.example.cadastro;

import jakarta.persistence.PreUpdate;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Column;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(
        name = "usuarios",
        uniqueConstraints = {
                @UniqueConstraint(name = "uk_usuario_cpf", columnNames = "cpf"),
                @UniqueConstraint(name = "uk_usuario_email", columnNames = "email")
        },
        indexes = {
                @Index(name = "idx_usuario_nome", columnList = "nome"),
                @Index(name = "idx_usuario_email", columnList = "email")
        }
)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, updatable = false)
    private UUID id;

    @NotBlank(message = "Nome obrigatório!")
    @Size(min = 2, max = 150, message = "Nome deve ter entre 2 e 150 caracteres.")
    @Column(name = "nome", nullable = false, length = 150)
    private String nome;

    @NotBlank(message = "CPF obrigatório!")
    @Pattern(regexp = "\\d{11}", message = "CPF deve ter exatamente 11 caracteres.")
    @Column(name = "cpf", nullable = false, length = 11, unique = true)
    private String cpf;

    @NotBlank(message = "E-mail obrigatório!")
    @Email(message = "E-mail inválido!")
    @Size(min = 10, max = 255, message = "E-mail deve ter entre 10 e 255 caracteres.")
    @Column(name = "email", nullable = false, length = 150)
    private String email;

    @PrePersist
    @PreUpdate
    private void normalizar() {
        if (this.nome != null) {
            this.nome = this.nome.trim();
        }
        if (this.cpf != null) {
            this.cpf = this.cpf.replaceAll("\\D", "");
        }
        if (this.email != null) {
            this.email = this.email.toLowerCase();
        }
    }
}