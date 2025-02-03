package com.ems.mapper;

import com.ems.dtos.ElectionDTO;
import com.ems.entities.Election;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ElectionMapper {
    ElectionDTO toElectionDto(Election election);
    Election toElection(ElectionDTO electionDTO);
}
