package org.ged.entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
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
	@JsonIncludeProperties(value = { "id", "titre" })
	private Structure structure;

	@OneToMany(mappedBy = "posteSuperieur", fetch = FetchType.EAGER)
	@JsonIncludeProperties(value = { "titre" })
	private Collection<Poste> posteSubalterne;

	@ManyToOne
	@JsonIncludeProperties(value = { "titre" })
	private Poste posteSuperieur;

	@JsonIncludeProperties(value = { "dateAffectation", "dateDepart", "employeid" })
	@OneToMany(mappedBy = "poste")
	private Collection<PosteEmploye> posteemploye;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "Role")
	private Collection<AppRole> roles = new ArrayList<>();

}
