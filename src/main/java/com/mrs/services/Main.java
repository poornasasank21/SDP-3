package com.mrs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrs.dao.JobOfferRepo;
import com.mrs.dao.StudentRepo;
import com.mrs.pojo.JobOffers;
import com.mrs.pojo.Student;
@Service

public class Main {
	@Autowired
	public StudentRepo repo;
	@Autowired
	public JobOfferRepo jrepo;
	public List<Student> getAllstudents()
	{
		
		List<Student> l=repo.findAll();
		return l;
	}
	public Student checkStudentLogin(String id,String pass)
	{
		Student s=repo.checkLogin(id, pass);
		return s;
	}
	public List<JobOffers> getJobOffList()
	{
		List<JobOffers> l=jrepo.findAll();
		return l;
	}

}
