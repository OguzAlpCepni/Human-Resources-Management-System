package com.SpringBoot.SpringBoot.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.SpringBoot.Business.abstracts.CandidateService;
import com.SpringBoot.SpringBoot.DataAcces.abstracts.CandidatesDao;
import com.SpringBoot.SpringBoot.Entities.concretes.Candidates;

@Service // bu class projede servis görevi görmektedir 
public class CandidateManager implements CandidateService{
	//DataAcceste bulununa CandidatesDao ya erişmem lazım bu işlemi yapmak içinde 
	private CandidatesDao candidatesDao;
	
	@Autowired
	public CandidateManager(CandidatesDao candidatesDao) {
		super();
		this.candidatesDao = candidatesDao;
	}
	@Override
	public List<Candidates> getAll() {
		
		return this.candidatesDao.findAll();
	}

}
