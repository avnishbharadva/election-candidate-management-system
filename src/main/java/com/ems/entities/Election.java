package com.ems.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "election")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Election {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "election_id")
    @Setter(AccessLevel.NONE)
    private long id;
    @Column(name = "name", unique = true, nullable = false)
    private String name;
    @Column(name = "type", nullable = false)
    private String type;
    @OneToMany(mappedBy = "election", cascade = CascadeType.ALL)
    private Set<Candidate> candidates;
    @ManyToMany(mappedBy = "elections")
    @JsonBackReference
    private Set<Party> parties;
}
