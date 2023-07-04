package empresa.com.mi_primer_app.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import empresa.com.mi_primer_app.models.Celular;
import empresa.com.mi_primer_app.repository.CelularRepository;

@RestController
@RequestMapping("/celular")
public class CelularController {


    @Autowired
    private CelularRepository celularRepository;


    @GetMapping("/")
    public List<empresa.com.mi_primer_app.models.Celular>getCelulares(){
        List<Celular> celulares = (List<Celular>) celularRepository.findAll();
        return celulares;
    }
    public Celular getCelulares(Celular celular){
        return null;
    }
    @PostMapping("/")
    public Celular createCelular(@RequestBody Celular celular){
        try {
            celularRepository.save(celular);
            return celular;
        }
        catch(Exception ex){
            return null;
        }

    }
    public Celular updateCelulares(Celular celular){
        return null;
    }
    public Celular deletCelular(Long id) {
        return null;
    }
}
