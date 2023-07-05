package empresa.com.mi_primer_app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import empresa.com.mi_primer_app.models.Celular;


public interface CelularRepository extends CrudRepository<Celular, Long> {
    public List<Celular> findAllByMarca(String marca);
    public List<Celular> findByModelo(String modelo);
    public Celular findOneById(Long id);
}
