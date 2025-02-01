package com.ems.party.entity;

import com.ems.candidate.entity.Candidate;
import com.ems.election.entity.Election;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "party")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Party {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "party_id")
    private long id;
    @Column(name = "name", unique = true, nullable = false)
    private String name;
    @OneToMany(mappedBy = "party")
    private Set<Candidate> candidates;
    @ManyToMany
    @JoinTable(name = "party_election", joinColumns = {
            @JoinColumn(name = "party_id", referencedColumnName = "party_id")
    },
            inverseJoinColumns = {
            @JoinColumn(name = "election_id", referencedColumnName = "election_id")
            }
    )
    @JsonManagedReference
    private Set<Election> elections;
}
