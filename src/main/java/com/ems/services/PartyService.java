package com.ems.services;

import com.ems.dtos.PartyDTO;
import com.ems.entities.Party;
import com.ems.mapper.PartyMapper;
import com.ems.repositories.PartyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PartyService {
    private final PartyRepository partyRepo;
    private final PartyMapper partyMapper;

    public PartyDTO findPartyById(long id){
        return partyMapper.toPartyDTO(partyRepo.findById(id).orElse(null));
    }
}
