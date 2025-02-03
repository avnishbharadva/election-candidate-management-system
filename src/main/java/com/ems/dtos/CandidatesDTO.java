package com.ems.dtos;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CandidatesDTO {
    private String firstName;
    private String middleName;
    private String lastName;
    private String candidateSSN;
    private LocalDateTime dob;
    private String gender;
    private String nationality;
    private Long partyId;
    private String position;
    private String state;
    private String district;
    private String educationQualification;
    private String contactNo;
    private String email;
    private String address;
    private Boolean criminalRecord;
    private Long electionId;
    private String approvalStatus;
}
