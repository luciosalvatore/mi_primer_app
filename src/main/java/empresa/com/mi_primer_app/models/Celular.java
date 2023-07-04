package empresa.com.mi_primer_app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
    public class Celular {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

   //     @Column(nullable = false, name = "marca", length = 50)
        private String marca;
        private String modelo;
    }

