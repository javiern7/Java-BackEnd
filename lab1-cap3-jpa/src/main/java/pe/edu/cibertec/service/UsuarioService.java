package pe.edu.cibertec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.dao.UsuarioDao;
import pe.edu.cibertec.dao.entity.UsuarioEntity;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioDao usuarioDAO;

    public UsuarioEntity validarLogin(UsuarioEntity usuario) {
        UsuarioEntity rpta = getUsuario(usuario.getUsuario());
        if (rpta == null)
            return rpta;
        if (!rpta.getClave().equalsIgnoreCase(usuario.getClave()))
            rpta = null;
        return rpta;
    }

    public void insertarUsuario(UsuarioEntity usuario) {
        usuarioDAO.save(usuario);
    }

    public List<UsuarioEntity> getListaUsuarios() {
        return usuarioDAO.findAll();
    }

    public UsuarioEntity getUsuario(String codigo) {
        UsuarioEntity rpta = null;
        Optional<UsuarioEntity> busqueda = usuarioDAO.findById(codigo);
        if (busqueda.isPresent())
            rpta = busqueda.get();
        return rpta;
    }
}
