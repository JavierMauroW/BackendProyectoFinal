package com.example.ProyectoFinal.Controller;

import com.example.ProyectoFinal.Model.Usuario;
import com.example.ProyectoFinal.Repository.RepositoryUsuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthController {
    private final RepositoryUsuario usuarioRepo;

    public AuthController(RepositoryUsuario usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    @PostMapping("/login")
    public ResponseEntity<Usuario> login(@RequestBody Usuario credenciales) {
        Usuario usuario = usuarioRepo.findByCorreoAndContrasena(
                credenciales.getCorreo(), credenciales.getContrasena()
        );
        if (usuario != null) {
            return ResponseEntity.ok(usuario);
        } else {
            return ResponseEntity.status(401).build();
        }
    }
}
