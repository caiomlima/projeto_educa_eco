package com.projeto_educa_eco.repository;

import com.projeto_educa_eco.models.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
    @Query("SELECT u FROM Usuario u WHERE u.nome = ?1")
    public Usuario findByNome(String nome);
}
