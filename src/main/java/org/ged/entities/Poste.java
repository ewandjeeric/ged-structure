package org.ged.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;

import lombok.*;
import org.hibernate.annotations.BatchSize;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Poste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titre;
    @Column(nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(nullable = false)
    @JsonIncludeProperties(value = {"id", "titre"})
    private Structure structure;

    @OneToMany(mappedBy = "posteSuperieur", fetch = FetchType.LAZY)
    @JsonIncludeProperties(value = {"id", "titre"})
    private Collection<Poste> posteSubalterne;

    @ManyToOne
    @JsonIncludeProperties(value = {"id", "titre"})
    private Poste posteSuperieur;

    @JsonIncludeProperties(value = {"id", "dateAffectation", "dateDepart", "employe"})
    @OrderBy("dateAffectation DESC")
    @BatchSize(size = 1)
    @OneToMany(mappedBy = "poste")
    private Set<PosteEmploye> posteemploye;

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JsonIncludeProperties(value = {"role"})
    private Set<AppRole> roles = new HashSet<>();

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JsonIncludeProperties(value = {"id", "nom"})
    private Set<Groupe> groupes = new HashSet<>();

    public Poste(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Poste{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", structure=" + structure +
                '}';
    }
}
