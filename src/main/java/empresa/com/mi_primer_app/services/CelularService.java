package empresa.com.mi_primer_app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import empresa.com.mi_primer_app.models.Celular;
import empresa.com.mi_primer_app.repository.CelularRepository;

@Service
public class CelularService {
    @Autowired CelularRepository celularRepository;

    public void crear(Celular celular){
        celularRepository.save(celular);
    }

    public List<Celular> listar() {
        return (List<Celular>) celularRepository.findAll();
    }

    public List<Celular> listarPorMarca(String marca) {
        return (List<Celular>) celularRepository.findAllByMarca(marca);
    }

    public List<Celular> listarPorModelo(String modelo) {
        return (List<Celular>) celularRepository.findByModelo(modelo);
    }

    public Celular buscarPorId(Long id) {
        return celularRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        if(celularRepository.existsById(id) == false){
            throw new RuntimeException("El celular no existe 👎");
        }
        celularRepository.deleteById(id);
    }

    public void actualizar(Celular celular) {
        if(!celularRepository.existsById(celular.getId())){
            throw new RuntimeException("El celular no existe 👎");
        }

        celularRepository.save(celular);
    }
}
