package com.ems.candidate.controller;

import com.ems.candidate.dto.CandidateDTO;
import com.ems.candidate.service.CandidateService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/candidate")
public class CandidateController {

    public final CandidateService candidateService;

    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @PostMapping("/register")
    public ResponseEntity<CandidateDTO> registerCandidate(@RequestBody CandidateDTO candidateDTO){
        return ResponseEntity.ok(candidateService.register(candidateDTO));
    }
}
