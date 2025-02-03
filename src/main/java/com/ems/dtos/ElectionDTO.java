package com.ems.dtos;

import lombok.*;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ElectionDTO {
    private String name;
    private String type;
    private Set<CandidatesDTO> candidates;
    private Set<PartyDTO> parties;
}
