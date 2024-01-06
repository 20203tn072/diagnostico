package utez.edu.mx.diagnostico.Controller;


import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utez.edu.mx.diagnostico.Model.Dto.UsuariosDto;
import utez.edu.mx.diagnostico.Model.Entity.UsuariosBean;
import utez.edu.mx.diagnostico.Service.IUsuarios;

import java.util.List;

@RestController
@RequestMapping("api/v1/usuarios")
public class UsuariosController {
    @Autowired
    private IUsuarios us;

    @GetMapping("/")
    @Transactional(readOnly = true)
    public List<UsuariosBean> getUsuarios(){
        return us.findAll();
    }

    @GetMapping("/{id}")
    @Transactional(readOnly = true)
    public UsuariosBean showById(@PathVariable Integer id){
        return us.findById(id);
    }
    @PostMapping("/")
    @Transactional
    public UsuariosDto create(@RequestBody UsuariosDto usuario){
        UsuariosBean user = us.save(usuario);
        return UsuariosDto.builder()
                .id(user.getId())
                .nombre(user.getNombre())
                .apellido(user.getApellido())
                .curp(user.getCurp())
                .fechadeNacimiento(user.getFechadeNacimiento())
                .build();
    }
    @PutMapping("/")
    @Transactional
    public UsuariosDto update(@RequestBody UsuariosDto usuario){
        UsuariosBean user = us.save(usuario);
        return UsuariosDto.builder()
                .id(user.getId())
                .nombre(user.getNombre())
                .apellido(user.getApellido())
                .curp(user.getCurp())
                .fechadeNacimiento(user.getFechadeNacimiento())
                .build();
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void delete(@PathVariable Integer id){
        UsuariosBean user = us.findById(id);
        us.delete(user);
    }
}
