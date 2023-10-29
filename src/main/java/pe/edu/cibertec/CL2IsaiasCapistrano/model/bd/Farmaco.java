package pe.edu.cibertec.CL2IsaiasCapistrano.model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "farmaco")
public class Farmaco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idfarmaco;
    @Column(name = "nomfarmaco")
    private String nomfarmaco;
    @Column(name = "precio")
    private Double precio;
}
