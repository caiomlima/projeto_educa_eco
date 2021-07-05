package com.projeto_educa_eco.security;

import com.projeto_educa_eco.main.DataController;
import com.projeto_educa_eco.models.Usuario;
import com.projeto_educa_eco.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

@Repository
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UsuarioRepository ur;

    @Override
    public UserDetails loadUserByUsername(String nome) throws UsernameNotFoundException {
        Usuario usr = ur.findByNome(nome);
        if (usr == null) {
            throw new UsernameNotFoundException("Usuario não encontrado");
        }
        return new CustomUserDetails(usr);
    }
}
