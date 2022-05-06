package org.ged.bean;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PosteEmployeBean {

	private Long id;
	private Date dateAffectation;
	private Date dateDepart;
	private int employeid;
	private long poste;

}
