package org.ged.entities;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Structure {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String titre;
	@Column(nullable = false)
	private String description;

	@OneToMany(mappedBy = "structure", fetch = FetchType.EAGER)
	@JsonIncludeProperties(value = { "id", "titre" })
	private Collection<Poste> postes;

	@ManyToOne
	@JsonIncludeProperties(value = { "id", "titre" })
	private Structure structureSuperieur;

	@OneToMany(mappedBy = "structureSuperieur")
	@JsonIncludeProperties(value = { "id", "titre" })
	private Collection<Structure> sousStructure;

	private boolean etat;

	public Structure(String titre, String description, Structure structureSuperieur) {
		super();
		this.titre = titre;
		this.description = description;
		this.structureSuperieur = structureSuperieur;
	}

}
