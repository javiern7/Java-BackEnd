package pe.edu.cibertec.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.dao.entity.UsuarioEntity;

public interface UsuarioDao extends JpaRepository<UsuarioEntity, String> {

}
