package com.ems.candidate.service;

import com.ems.candidate.dto.CandidateDTO;
import com.ems.candidate.mapper.CandidateMapper;
import com.ems.candidate.repository.CandidateRepo;
import org.springframework.stereotype.Service;

@Service
public class CandidateService {

    private final CandidateRepo candidateRepo;
    private final CandidateMapper candidateMapper;

    public CandidateService(CandidateRepo candidateRepo, CandidateMapper candidateMapper) {
        this.candidateRepo = candidateRepo;
        this.candidateMapper = candidateMapper;
    }

    public CandidateDTO register(CandidateDTO candidateDTO) {
        return candidateMapper.candidateToCandidateDTO(candidateRepo.save(candidateMapper.candidateDTOToCandidate(candidateDTO)));
    }
}
