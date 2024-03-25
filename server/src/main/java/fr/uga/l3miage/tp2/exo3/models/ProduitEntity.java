package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ProduitEntity {
    @Id
    private Long id;
    private String nom;
    private Double prix;
    private Integer quantite;
    @ManyToOne
    private CatégorieDeProduitEntity categories;
}
