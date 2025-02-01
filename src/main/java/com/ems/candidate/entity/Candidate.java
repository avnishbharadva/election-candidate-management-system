package com.ems.candidate.entity;

import com.ems.election.entity.Election;
import com.ems.party.entity.Party;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "candidate")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "candidate_id")
    private long id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "middle_name", nullable = false)
    private String middleName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "ssn", unique = true, nullable = false)
    private String candidateSSN;
    @Column(name = "date_of_birth", nullable = false)
    private LocalDateTime dob;
    @Column(name = "gender", nullable = false)
    private String gender;
    @Column(name = "nationality", columnDefinition = "default varchar usa")
    private String nationality;
    @ManyToOne
    @JoinColumn(name = "party_id")
    private Party party;
    @Column(name = "position", nullable = false)
    private String position;
    @Column(name = "state", nullable = false)
    private String state;
    @Column(name = "district", nullable = false)
    private String district;
    @Column(name = "education_qualification", nullable = false)
    private String educationQualification;
    @Column(name = "contact_no", unique = true, nullable = false)
    private String contactNo;
    @Column(name = "email", unique = true, nullable = false)
    private String email;
    @Column(name = "address", nullable = false)
    private String address;
    @Column(name = "criminal_record", columnDefinition = "default boolean false")
    private boolean criminalRecord;
    @ManyToOne
    @JoinColumn(name = "election_id")
    private Election election;
    @Column(name = "approval_status", nullable = false)
    private String approvalStatus;
}
