package utez.edu.mx.diagnostico.Service.Imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utez.edu.mx.diagnostico.Model.Dao.UsuariosDao;
import utez.edu.mx.diagnostico.Model.Entity.UsuariosBean;
import utez.edu.mx.diagnostico.Service.IUsuarios;

import java.util.List;

@Service
public class UsuariosImp extends IUsuarios {
    @Autowired
    private UsuariosDao dao;

    @Override
    public UsuariosBean save(UsuariosBean cli) {
        UsuariosBean user = UsuariosBean.builder()
                .id(cli.getId())
                .nombre(cli.getNombre())
                .apellido(cli.getApellido())
                .curp(cli.getCurp())
                .fechadeNacimiento(cli.getFechadeNacimiento())
                .build();
        return dao.save(user);
    }

    @Override
    public UsuariosBean findById(Integer id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public void delete(UsuariosBean cli) {
        dao.delete(cli);
    }

    @Override
    public List<UsuariosBean> findAll() {
        return (List<UsuariosBean>) dao.findAll();
    }
}
