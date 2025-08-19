package pe.edu.cibertec.capitulo2.repository;

import org.springframework.stereotype.Repository;
import pe.edu.cibertec.capitulo2.dto.UserDto;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    private List<UserDto> listaUser = null;

    public UserRepository (){
        listaUser = new ArrayList<>();
        listaUser.add(new UserDto("pguerreo","123456","Softaware Engineer 1"));
        listaUser.add(new UserDto("jfarfan","123456","Tech Lead"));
        listaUser.add(new UserDto("cpizarro","123456","Softaware Engineer 2"));
    }

    public void insertar(UserDto usuario){
        listaUser.add(usuario);
    }

    public List<UserDto> listaUsuarios() {
        return listaUser;
    }

    public UserDto obtenerUsuario(String usuario){
        UserDto respuesta = null;
        for(UserDto userDto : listaUser){
            if(userDto.getUser().equals(usuario)){
                respuesta = userDto;
                break;
            }
        }
        return respuesta;
    }

    public UserDto validateLogin(UserDto userView) {
        if("admin".equalsIgnoreCase(userView.getUser()) && "admin1".equalsIgnoreCase(userView.getPassword()))
            userView.setFullName("User Administrador SYS");
        else
            userView = null;
        return userView;
    }
}
