package com.galindodiego.usuariologin.repository;

import com.galindodiego.usuariologin.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {


}
