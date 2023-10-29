package pe.edu.cibertec.CL2IsaiasCapistrano.controller.administracion;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.cibertec.CL2IsaiasCapistrano.service.FarmacoService;

@AllArgsConstructor
@Controller
@RequestMapping("/administracion/farmaco")
public class FarmacoController {
    private FarmacoService farmacoService;
    @GetMapping("/frmfarmaco")
    public String index(Model model){
        model.addAttribute("listarfarmacos",
                farmacoService.listarFarmacos());
        return "administracion/frmfarmaco";
    }
}
