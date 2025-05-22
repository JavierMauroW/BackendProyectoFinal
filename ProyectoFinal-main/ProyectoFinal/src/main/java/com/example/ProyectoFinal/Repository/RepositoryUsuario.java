    package com.example.ProyectoFinal.Repository;

    import com.example.ProyectoFinal.Model.Usuario;
    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.stereotype.Repository;




    @Repository
    public interface RepositoryUsuario extends JpaRepository<Usuario, Integer> {
        Usuario findByCorreoAndContrasena(String correo, String contrasena);

        boolean existsByCorreo(String correo);
    }
