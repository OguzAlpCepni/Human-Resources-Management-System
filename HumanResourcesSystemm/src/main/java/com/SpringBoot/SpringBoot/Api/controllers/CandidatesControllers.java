package com.SpringBoot.SpringBoot.Api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.SpringBoot.Business.abstracts.CandidateService;
import com.SpringBoot.SpringBoot.Entities.concretes.Candidates;

@RestController // sen bir controllersin
@RequestMapping("/api/candidates") // bu anatasyon yardımı ile dış dünya ile iletişim kumamızı sağlayacak 
public class CandidatesControllers {
	
	// şimdide Candidades Serviceye erişmemiz lazım 
	private CandidateService candidateService;
	// IOC
	@Autowired
	public CandidatesControllers(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
	}

	@GetMapping("/getall") // çünkü biz bir veri istiyoruzzzz   
	public List<Candidates> getAll(){
		return this.candidateService.getAll();
	}
	
}
