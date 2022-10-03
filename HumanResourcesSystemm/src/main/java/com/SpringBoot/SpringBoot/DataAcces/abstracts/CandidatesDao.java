package com.SpringBoot.SpringBoot.DataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBoot.SpringBoot.Entities.concretes.Candidates;

public interface CandidatesDao extends JpaRepository<Candidates,Integer>{ // candidates ile ilgili CRUD işlemleri tamamdır 

}
