package com.javaCDG.CDGp.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String mdp;

    @Column(nullable=false,unique = true,name = "email")
    private String email;

    @ManyToMany
    private List<Role> roles=new ArrayList<>();




}
