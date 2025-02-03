package com.ems.controllers;

import com.ems.dtos.CandidatesDTO;
import com.ems.services.CandidateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/candidates")
@RequiredArgsConstructor
public class CandidateController {

    public final CandidateService candidateService;

    @PostMapping("/register")
    public ResponseEntity<CandidatesDTO> registerCandidate(@RequestBody CandidatesDTO candidatesDTO){
        return ResponseEntity.ok(candidateService.register(candidatesDTO));
    }
}
