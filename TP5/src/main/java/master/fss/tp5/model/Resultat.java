package master.fss.tp5.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "resultat")
@Data
public class Resultat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "valeur_a")
    private Double a;

    @Column(name = "valeur_b")
    private Double b;

    @Column(name = "operation")
    private String operation;

    @Column(name = "resultat")
    private Double resultat;

    public Resultat() {}

    public Resultat(Double a, Double b, String operation, Double resultat) {
        this.a = a;
        this.b = b;
        this.operation = operation;
        this.resultat = resultat;
    }
}