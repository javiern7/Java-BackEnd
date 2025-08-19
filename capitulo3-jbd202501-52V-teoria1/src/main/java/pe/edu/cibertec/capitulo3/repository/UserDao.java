package pe.edu.cibertec.capitulo3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.capitulo3.repository.entity.UserEntity;

public interface UserDao extends JpaRepository<UserEntity, String> {
}
