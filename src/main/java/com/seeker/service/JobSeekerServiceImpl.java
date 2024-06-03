package com.seeker.service;

import com.seeker.entity.JobSeeker;
import com.seeker.repository.IJobSeekerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerServiceImpl implements IJobSeekerService {

	@Autowired
	private IJobSeekerRepository jobSeekerRepository;

	@Override
	public List<JobSeeker> findByJobSeekerNameEqualsService(String JobSeekerName) {
		return jobSeekerRepository.findByJobSeekerNameEquals(JobSeekerName);
	}

	@Override
	public List<JobSeeker> getByJobSeekerNameIsService(String JobSeekerName) {
		return jobSeekerRepository.getByJobSeekerNameIs(JobSeekerName);
	}

	@Override
	public List<JobSeeker> readByJobSeekerNameService(String JobSeekerName) {
		return jobSeekerRepository.readByJobSeekerName(JobSeekerName);
	}

	@Override
	public List<JobSeeker> findByPercentageBetweenService(double start, double end) {
		return jobSeekerRepository.findByPercentageBetween(start, end);
	}

	@Override
	public List<JobSeeker> findByJobSeekerNameStartingWithService(String nameInitialChars) {
		return jobSeekerRepository.findByJobSeekerNameStartingWith(nameInitialChars);
	}

	@Override
	public List<JobSeeker> findByJobSeekerNameEndingWithIgnoreCaseService(String nameLastChars) {
		return jobSeekerRepository.findByJobSeekerNameEndingWithIgnoreCase(nameLastChars);
	}

	@Override
	public List<JobSeeker> findByJobSeekerNameContainingIgnoreCaseService(String chars) {
		return jobSeekerRepository.findByJobSeekerNameContainingIgnoreCase(chars);
	}

	@Override
	public List<JobSeeker> findByJobSeekerNameLikeIgnoreCaseService(String pattern) {
		return jobSeekerRepository.findByJobSeekerNameLikeIgnoreCase(pattern);
	}

	@Override
	public List<JobSeeker> findByQlfyInService(List<String> qualifications) {
		return jobSeekerRepository.findByQlfyIn(qualifications);
	}

	@Override
	public List<JobSeeker> readByMobileNoIsNullService() {
		return jobSeekerRepository.readByMobileNoIsNull();
	}

	@Override
	public List<JobSeeker> findByQlfyInOrderByQlfyAscService(List<String> qualifications) {
		return jobSeekerRepository.findByQlfyInOrderByQlfyAsc(qualifications);
	}
}
