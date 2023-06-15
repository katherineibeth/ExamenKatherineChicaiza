package ec.edu.espe.arquitectura.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.edu.espe.arquitectura.examen.model.SegPerfil;


@Repository
public interface SegPerfilRepository extends JpaRepository<SegPerfil,String>{
    
}
