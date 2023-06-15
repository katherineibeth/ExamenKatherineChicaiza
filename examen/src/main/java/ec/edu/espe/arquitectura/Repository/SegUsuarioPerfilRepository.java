package ec.edu.espe.arquitectura.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.edu.espe.arquitectura.examen.model.SegUsuarioPerfil;

@Repository
public interface SegUsuarioPerfilRepository extends JpaRepository <SegUsuarioPerfil, Integer>{
    
}
