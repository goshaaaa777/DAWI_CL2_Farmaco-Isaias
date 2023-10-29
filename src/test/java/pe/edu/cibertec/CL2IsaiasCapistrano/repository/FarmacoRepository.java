package pe.edu.cibertec.CL2IsaiasCapistrano.repository;

import pe.edu.cibertec.CL2IsaiasCapistrano.model.bd.Farmaco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmacoRepository extends JpaRepository <Farmaco,
        Integer> {
}
