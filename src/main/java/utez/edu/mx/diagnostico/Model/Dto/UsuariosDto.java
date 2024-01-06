package utez.edu.mx.diagnostico.Model.Dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuariosDto {

    private Integer id;
    private String nombre;
    private String apellido;
    private String curp;
    private String fechadeNacimiento;
}
