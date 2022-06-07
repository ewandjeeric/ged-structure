package org.ged.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ged.entities.Poste;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupeBean {
    private long id;
    private String nom;
    private List<String> role;
    private List<Long> poste;
}
