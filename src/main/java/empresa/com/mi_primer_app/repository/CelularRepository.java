package empresa.com.mi_primer_app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import empresa.com.mi_primer_app.models.Celular;


@Repository
public interface CelularRepository extends CrudRepository<Celular, Long> {
    
}
