package org.ged.entities;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public Employe(Integer employeId, String employeName, String employeSurname) {
        this.employeId = employeId;
        this.employeName = employeName;
        this.employeSurname = employeSurname;

    }

    public Employe(Integer employeId) {
        this.employeId = employeId;
    }
}
