package org.ged.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AppRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String role;
    @Column(columnDefinition = "boolean default false")
    private Boolean create;
    @Column(columnDefinition = "boolean default false")
    private Boolean read;
    @Column(columnDefinition = "boolean default false")
    private Boolean update;
    @Column(columnDefinition = "boolean default false")
    private Boolean delete;
}
