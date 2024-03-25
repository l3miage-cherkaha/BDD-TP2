package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class CommandeEntity {
    @Id
    private Long id;
    private Date date;
    private double montantTotal;

    @ManyToOne
    private ClientEntity client;

    @OneToMany
    @JoinColumn(name="id_produit",referencedColumnName = "id")
    private Set<ProduitEntity> produits;
}
