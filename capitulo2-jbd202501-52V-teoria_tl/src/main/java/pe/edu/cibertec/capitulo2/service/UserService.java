package pe.edu.cibertec.capitulo2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.capitulo2.dto.UserDto;
import pe.edu.cibertec.capitulo2.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public UserDto validaLogin(UserDto userView) {
        return repository.validateLogin(userView);
    }

    public void insertarUsuario(UserDto usuario) {
        repository.insertar(usuario);
    }

    public List<UserDto> listaUsuarios() {
        return repository.listaUsuarios();
    }

    public UserDto obtenerUser(String usuario){
        return repository.obtenerUsuario(usuario);
    }
}
