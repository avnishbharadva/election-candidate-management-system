package com.ems.candidate.mapper;

import com.ems.candidate.dto.CandidateDTO;
import com.ems.candidate.entity.Candidate;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CandidateMapper {
    CandidateDTO candidateToCandidateDTO(Candidate candidate);
    Candidate candidateDTOToCandidate(CandidateDTO candidateDTO);
}
