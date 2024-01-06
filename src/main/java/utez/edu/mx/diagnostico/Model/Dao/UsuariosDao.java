package utez.edu.mx.diagnostico.Model.Dao;

import org.springframework.data.repository.CrudRepository;
import utez.edu.mx.diagnostico.Model.Entity.UsuariosBean;

public interface UsuariosDao extends CrudRepository<UsuariosBean, Integer> {
}
