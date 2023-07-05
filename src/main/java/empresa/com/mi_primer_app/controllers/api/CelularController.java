package empresa.com.mi_primer_app.controllers.api;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import empresa.com.mi_primer_app.models.Celular;
import empresa.com.mi_primer_app.services.CelularService;

@RestController
@RequestMapping("/celular")
public class CelularController {


    @Autowired
    CelularService celularService;


    @GetMapping("/")
    public List<empresa.com.mi_primer_app.models.Celular>getCelulares(){
        List<Celular> celulares = celularService.listar();
        return celulares;
    }
    public Celular getCelulares(Celular celular){
        return null;
    }
    @PostMapping("/")
    public Celular createCelular(@RequestBody Celular celular){
        try {
            celularService.crear(celular);
            return celular;
        }
        catch(Exception ex){
            return null;
        }

    }

    @GetMapping("/marca")
    public List<Celular> getCelularesByMarca(@RequestParam  String marca){
        if(marca == null || marca.isEmpty()){
            return null;
        }
        List<Celular> celulares = celularService.listarPorMarca(marca);
        return celulares;
    }

    @GetMapping("/modelo")
    public List<Celular> getCelularesByModelo(@RequestParam  String modelo){
        if(modelo == null || modelo.isEmpty()){
            return null;
        }
        List<Celular> celulares = celularService.listarPorModelo(modelo);
        return celulares;
    }

    @GetMapping("/detail")
    public Celular getCelularById(@RequestParam(value = "id") Long id){
        if(id == null){
            return null;
        }
        Celular celular = celularService.buscarPorId(id);
        return celular;
    }
    @PutMapping("/")
    public String updateCelulares(@RequestBody Celular celular) {
        try {
            celularService.actualizar(celular);
            return "Celular actualizado";
        }catch(RuntimeException ex){
            return ex.getMessage();
        }
    }

    @DeleteMapping("/{id}")
    public String deletCelular(@PathVariable Long id) {
        try {
            celularService.eliminar(id);
            return "Celular eliminado";
        }
        catch(RuntimeException ex){
            return ex.getMessage();
        }
    }
}
