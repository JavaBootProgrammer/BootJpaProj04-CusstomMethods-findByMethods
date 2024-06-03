package com.seeker.service;

import com.seeker.entity.JobSeeker;

import java.util.List;

public interface IJobSeekerService {

    public List<JobSeeker> findByJobSeekerNameEqualsService(String name);

    public List<JobSeeker> getByJobSeekerNameIsService(String name);

    public List<JobSeeker> readByJobSeekerNameService(String name);

    public List<JobSeeker> findByPercentageBetweenService(double start, double end);

    public List<JobSeeker> findByJobSeekerNameStartingWithService(String nameInitialChars);

    public List<JobSeeker> findByJobSeekerNameEndingWithIgnoreCaseService(String nameLastChars);

    public List<JobSeeker> findByJobSeekerNameContainingIgnoreCaseService(String chars);

    public List<JobSeeker> findByJobSeekerNameLikeIgnoreCaseService(String pattern);

    public List<JobSeeker> findByQlfyInService(List<String> qualifications);

    public List<JobSeeker> readByMobileNoIsNullService();

    public List<JobSeeker> findByQlfyInOrderByQlfyAscService(List<String> qualifications);
}
