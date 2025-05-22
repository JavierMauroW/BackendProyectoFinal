package com.example.ProyectoFinal.Controller;

import com.example.ProyectoFinal.Model.Usuario;
import com.example.ProyectoFinal.Repository.RepositoryUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*")
public class ControllerUsuario {

    @Autowired
    private RepositoryUsuario usuarioRepository;

    @GetMapping
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<?> createUsuario(@RequestBody Usuario usuario) {
        if (usuarioRepository.existsByCorreo(usuario.getCorreo())) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body("El correo ya está registrado");
        }
        Usuario guardado = usuarioRepository.save(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(guardado);
    }



    @PutMapping("/{id}")
    public ResponseEntity<?> updateUsuario(
            @PathVariable int id,
            @RequestBody Usuario usuario
    ) {
        if (!usuarioRepository.existsById(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario no encontrado");
        }
        usuario.setIdUsuario(id);
        Usuario usuarioActualizado = usuarioRepository.save(usuario);
        return ResponseEntity.ok(usuarioActualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUsuario(@PathVariable int id) {
        if (!usuarioRepository.existsById(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario no encontrado");
        }
        usuarioRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    /**
     * Endpoint de login.
     * Recibe un JSON con { "correo": "...", "contrasena": "..." }
     * Retorna el Usuario si las credenciales coinciden, o un error si no.
     */
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Usuario credenciales) {
        Usuario usuario = usuarioRepository
                .findByCorreoAndContrasena(
                        credenciales.getCorreo(),
                        credenciales.getContrasena()
                );

        if (usuario == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body("Correo o contraseña incorrectos");
        }
        return ResponseEntity.ok(usuario);
    }
}
