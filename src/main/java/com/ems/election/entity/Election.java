package com.ems.election.entity;

import com.ems.candidate.entity.Candidate;
import com.ems.party.entity.Party;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Set;

@Entity
@Table(name = "election")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Election {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "election_id")
    private long id;
    @Column(name = "name", unique = true, nullable = false)
    private String name;
    @Column(name = "type", nullable = false)
    private String type;
    @OneToMany(mappedBy = "election")
    private Set<Candidate> candidates;
    @ManyToMany(mappedBy = "elections")
    @JsonBackReference
    private Set<Party> parties;
}
