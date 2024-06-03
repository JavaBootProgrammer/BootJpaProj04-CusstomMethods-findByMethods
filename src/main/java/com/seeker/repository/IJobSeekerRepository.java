package com.seeker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seeker.entity.JobSeeker;

public interface IJobSeekerRepository extends JpaRepository<JobSeeker, Integer> {

	public List<JobSeeker> findByJobSeekerNameEquals(String name);

	public List<JobSeeker> getByJobSeekerNameIs(String name);
	public List<JobSeeker> readByJobSeekerName(String name);

	public List<JobSeeker> findByPercentageBetween(double start, double end);

	public List<JobSeeker> findByJobSeekerNameStartingWith(String nameInitialChars);

	public List<JobSeeker> findByJobSeekerNameEndingWithIgnoreCase(String nameLastChars);

	public List<JobSeeker> findByJobSeekerNameContainingIgnoreCase(String chars);

	public List<JobSeeker> findByJobSeekerNameLikeIgnoreCase(String pattern);

	public List<JobSeeker> findByQlfyIn(List<String> qualifications);

	public List<JobSeeker> readByMobileNoIsNull();

	public List<JobSeeker> findByQlfyInOrderByQlfyAsc(List<String> qualifications);

}
