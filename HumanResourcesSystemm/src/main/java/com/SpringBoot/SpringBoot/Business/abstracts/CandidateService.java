package com.SpringBoot.SpringBoot.Business.abstracts;

import java.util.List;

import com.SpringBoot.SpringBoot.Entities.concretes.Candidates;

public interface CandidateService {
	List<Candidates> getAll();
}
