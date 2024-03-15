
package fr.uga.l3miage.tp2.exo1.models;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlIDREF;
import java.math.BigInteger;
import java.util.Set;

@Entity
@Table(name="projet")
public class ProjectEntity {
    @Id
    @Column
    private  Integer Id;
    @Column
    private String name;
    @Column
    private String description;
    @ManyToMany(mappedBy = "project")
    private Set<DeveloperMiage> developpers;
}
