package com.ems.services;

import com.ems.dtos.CandidatesDTO;
import com.ems.dtos.ElectionDTO;
import com.ems.dtos.PartyDTO;
import com.ems.entities.Candidate;
import com.ems.entities.Election;
import com.ems.entities.Party;
import com.ems.mapper.CandidateMapper;
import com.ems.mapper.ElectionMapper;
import com.ems.mapper.PartyMapper;
import com.ems.repositories.CandidateRepository;
import com.ems.repositories.ElectionRepository;
import com.ems.repositories.PartyRepository;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CandidateService {

    private final CandidateRepository candidateRepo;
    private final CandidateMapper candidateMapper;
    private final ElectionMapper electionMapper;
    private final PartyMapper partyMapper;

    private ElectionService electionService;
    private PartyService partyService;
    private ElectionRepository electionRepository;
    private PartyRepository partyRepository;

    @Autowired
    public void setElectionRepository(ElectionRepository electionRepository) {
        this.electionRepository = electionRepository;
    }

    @Autowired
    public void setPartyRepository(PartyRepository partyRepository) {
        this.partyRepository = partyRepository;
    }

    @Autowired
    public void setElectionService(ElectionService electionService) {
        this.electionService = electionService;
    }

    @Autowired
    public void setPartyService(PartyService partyService) {
        this.partyService = partyService;
    }

    private ElectionDTO findElectionById(Long id){
        return electionService.findElectionById(id);
    }

    private PartyDTO findPartyById(long id) {
        return partyService.findPartyById(id);
    }

    public CandidatesDTO register(CandidatesDTO candidatesDTO) {
        Election election = electionRepository.findById(candidatesDTO.getElectionId()).orElseThrow(() -> new RuntimeException("Election not found with id : " + candidatesDTO.getElectionId()));
        Party party = partyRepository.findById(candidatesDTO.getPartyId()).orElseThrow(() -> new RuntimeException("Party not found with id : " + candidatesDTO.getPartyId()));
        Candidate candidate = candidateMapper.candidateDTOToCandidate(candidatesDTO);
        candidate.setElection(election);
        candidate.setParty(party);
        Candidate savedCandidate = candidateRepo.save(candidate);
        return candidateMapper.candidateToCandidateDTO(savedCandidate);
    }
}
