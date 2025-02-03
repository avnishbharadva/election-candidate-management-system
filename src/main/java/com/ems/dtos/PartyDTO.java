package com.ems.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PartyDTO {
    private String name;
    private Set<CandidatesDTO> candidates;
    private Set<ElectionDTO> elections;
}
