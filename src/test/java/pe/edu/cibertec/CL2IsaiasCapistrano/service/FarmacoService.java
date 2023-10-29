package pe.edu.cibertec.CL2IsaiasCapistrano.service;

import pe.edu.cibertec.CL2IsaiasCapistrano.model.bd.Farmaco;
import pe.edu.cibertec.CL2IsaiasCapistrano.repository.FarmacoRepository;

import java.util.List;

public class FarmacoService {
    private FarmacoRepository farmacoRepository;

    public List<Farmaco> listarFarmacos(){
        return farmacoRepository.findAll();
    }
}
