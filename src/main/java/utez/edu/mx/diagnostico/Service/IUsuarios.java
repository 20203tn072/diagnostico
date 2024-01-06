package utez.edu.mx.diagnostico.Service;

import utez.edu.mx.diagnostico.Model.Dto.UsuariosDto;
import utez.edu.mx.diagnostico.Model.Entity.UsuariosBean;

import java.util.List;

public abstract class IUsuarios {

    public UsuariosBean save(UsuariosDto cli) {
        return null;
    }

    public abstract UsuariosBean save(UsuariosBean cli);

    public UsuariosBean findById(Integer id) {
        return null;
    }

    public void delete(UsuariosBean cli) {

    }

    public List<UsuariosBean> findAll() {
        return null;
    }
}
