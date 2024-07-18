package com.javaCDG.CDGp.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="NA")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NiveauAlerte {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;


    @Column(name = "mineur")
    private String mineur;

    @Column(nullable=false,name = "modere")
    private String modere;

    @Column(nullable=false,name = "majeur")
    private String majeur;

    //getters & setters

}
