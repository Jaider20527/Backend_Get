package dev.germantovar.springboot.entities;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name= "crearcasos")
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String cliente;
    private String tipocaso;
    private Date fechainicio;
    private Date fechacierre;
    private String prioridad;
    private String estado;
    private String descripcioncaso;
    private String abogadoasignado;

}
