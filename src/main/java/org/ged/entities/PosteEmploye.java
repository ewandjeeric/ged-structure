package org.ged.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PosteEmploye {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dateAffectation;

	@Temporal(TemporalType.DATE)
	private Date dateDepart;

	private int employeid;

	@Transient
	@JsonIncludeProperties(value = { "employeId", "employeName" })
	private Employe employe;

	@ManyToOne
	@JsonIncludeProperties(value = { "titre", "roles" })
	private Poste poste;

	public PosteEmploye(Long id, Date dateAffectation, Date dateDepart, int employeid, Poste poste) {
		super();
		this.id = id;
		this.dateAffectation = dateAffectation;
		this.dateDepart = dateDepart;
		this.employeid = employeid;
		this.poste = poste;
	}

}
