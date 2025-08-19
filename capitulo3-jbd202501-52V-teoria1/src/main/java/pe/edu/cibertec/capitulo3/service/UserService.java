package pe.edu.cibertec.capitulo3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.capitulo3.repository.UserDao;
import pe.edu.cibertec.capitulo3.repository.entity.UserEntity;


import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserDao repository;

    public UserEntity validaLogin(UserEntity userView) {
        UserEntity respuesta = obtenerUser(userView.getUser());
        if (respuesta == null) {
            return respuesta;
        }
        if (!respuesta.getPassword().equalsIgnoreCase(userView.getPassword())) {
            respuesta=null;
        }
        return respuesta;
    }

    public void insertarUsuario(UserEntity usuario) {
        repository.save(usuario);
    }

    public List<UserEntity> listaUsuarios() {
        return repository.findAll();
    }

    public UserEntity obtenerUser(String usuario){
        UserEntity respuesta = null;
        Optional<UserEntity> busqueda = repository.findById(usuario);
        if(busqueda.isPresent()){
            respuesta = busqueda.get();
        }
        return respuesta;
    }
}
