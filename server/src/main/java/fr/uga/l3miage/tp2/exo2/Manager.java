package fr.uga.l3miage.tp2.exo2;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

@Entity
public class Manager extends Employe {
    private String niveauGestion;

}
