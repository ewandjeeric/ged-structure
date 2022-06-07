package org.ged.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PosteBean {

    private Long id;
    private String titre;
    private String description;
    private long structure;
    private long posteSuperieur;
    private Set<String> roles;

}
