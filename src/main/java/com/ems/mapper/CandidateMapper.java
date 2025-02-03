package com.ems.mapper;

import com.ems.dtos.CandidatesDTO;
import com.ems.entities.Candidate;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CandidateMapper {
    CandidatesDTO candidateToCandidateDTO(Candidate candidate);
    Candidate candidateDTOToCandidate(CandidatesDTO candidatesDTO);
}
