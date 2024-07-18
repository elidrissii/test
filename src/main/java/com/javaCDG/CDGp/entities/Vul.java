package com.javaCDG.CDGp.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vul {

    //les constructeurs
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Date")
    private Date date;

    @Column(nullable = false)
    private String vulname;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false, name = "Source")
    private String source;

    @Column(nullable = false)
    private String ActiviteConcerne;

    @Column(nullable = false, name = "Impact")
    private String impact;

    @Column(nullable = false)
    private String ActionP;

    @Column(nullable = false)
    private String ActionM;

    @Column(nullable = false, name = "Responsable")
    private String responsable;

    @Column(nullable = false, name = "Echeance")
    private Date echeance;

    @ManyToOne
    @JoinColumn(name="niv_alerte")
    private NiveauAlerte nivAlerte;


    //getters & setters



}
