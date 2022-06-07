package org.ged.entities;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;

import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Structure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titre;
    @Column(nullable = false)
    private String description;

    @OneToMany(mappedBy = "structure", fetch = FetchType.LAZY)
    @JsonIncludeProperties(value = {"id", "titre"})
    private Set<Poste> postes = new HashSet<>();

    @ManyToOne
    @JsonIncludeProperties(value = {"id", "titre"})
    private Structure structureSuperieur;

    @OneToMany(mappedBy = "structureSuperieur", fetch = FetchType.LAZY)
    @JsonIncludeProperties(value = {"id", "titre"})
    private Set<Structure> sousStructure = new HashSet<>();
    @Column(columnDefinition = "boolean default false")
    private boolean position;

    public Structure(String titre, String description, Structure structureSuperieur) {
        super();
        this.titre = titre;
        this.description = description;
        this.structureSuperieur = structureSuperieur;
    }

}
