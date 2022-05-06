package org.ged.entities;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employe {
	private Integer employeId;
	private long directionsId;
	private String employeName;
	private String employeSurname;
	private String employeEmail;
	private String employePassword;
	private String employePhoneNumber;
	private String employeMatricule;
	private String employeLogin;
	private Date employeBirthdate;
	private String employePlaceOfBirth;
	private String employeNationality;
	private String employeAdress;
	private boolean isFirstConnection;
	private String employeGender;
	private short status;
}
