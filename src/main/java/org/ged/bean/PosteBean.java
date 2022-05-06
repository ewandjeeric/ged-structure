package org.ged.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PosteBean {

	private Long id;
	private String titre;
	private String description;
	private long structure;
	private long posteSuperieur;

}
