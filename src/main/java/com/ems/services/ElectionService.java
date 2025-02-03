package com.ems.services;

import com.ems.dtos.ElectionDTO;
import com.ems.entities.Election;
import com.ems.mapper.ElectionMapper;
import com.ems.repositories.ElectionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ElectionService {
    private final ElectionRepository electionRepo;
    private final ElectionMapper electionMapper;

    public ElectionDTO findElectionById(long id){
        Election election = electionRepo.findById(id).orElse(null);
        return electionMapper.toElectionDto(election);
    }
}
