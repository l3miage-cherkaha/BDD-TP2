package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="developer_miage")
public class DeveloperMiage {
    @Id
    @Column
    private String lastname;
    @Column
    private String firstname;
    @Column
    private String email;
    @ManyToMany
    private Set<ProjectEntity> project;
}
