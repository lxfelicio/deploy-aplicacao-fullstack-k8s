package com.exemplo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.*;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/api/usuarios")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); // Inicia a aplicação
    }

    @Entity
    public class Usuario {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String nome;
        private String email;
        private String comentario;

        // Getters e Setters
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getComentario() {
            return comentario;
        }

        public void setComentario(String comentario) {
            this.comentario = comentario;
        }
    }

    public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
        // Métodos de consulta podem ser definidos aqui
    }

    @Autowired
    private UsuarioRepository usuarioRepository; // Injeção do repositório

    @PostMapping
    public String insert(@RequestBody Usuario usuario) {
        usuarioRepository.save(usuario); // Salva o usuário no banco de dados
        return "Usuário salvo com sucesso!";
    }

    @GetMapping
    public List<Usuario> getAll() {
        return usuarioRepository.findAll(); // Retorna todos os usuários
    }
      }
