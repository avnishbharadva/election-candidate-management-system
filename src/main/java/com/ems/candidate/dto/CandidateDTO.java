package com.ems.candidate.dto;

import com.ems.election.entity.Election;
import com.ems.party.entity.Party;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidateDTO {
    private String firstName;
    private String middleName;
    private String lastName;
    private String candidateSSN;
    private LocalDateTime dob;
    private String gender;
    private String nationality;
    private Party party;
    private String position;
    private String state;
    private String district;
    private String educationQualification;
    private String contactNo;
    private String email;
    private String address;
    private boolean criminalRecord;
    private Election election;
    private String approvalStatus;
}
