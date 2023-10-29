package pe.edu.cibertec.CL2IsaiasCapistrano.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.CL2IsaiasCapistrano.model.bd.Farmaco;

@Repository
public interface FarmacoRepository extends JpaRepository <Farmaco,
        Integer> {
}
