package com.projeto_educa_eco.main;

import com.projeto_educa_eco.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public class DataController {

	@Repository
	public interface UserRepository extends JpaRepository <Usuario, Integer > {
	    Usuario findById(int Id);
	}
}
