package com.seeker.service;

import com.seeker.entity.JobSeeker;

import java.util.List;

public interface IJobSeekerService {

    public List<JobSeeker> findByJsNameEqualsService(String name);

    public List<JobSeeker> getByJsNameIsService(String name);

    public List<JobSeeker> readByJsNameService(String name);

    public List<JobSeeker> findByPercentageBetweenService(double start, double end);

    public List<JobSeeker> findByJsNameStartingWithService(String nameInitialChars);

    public List<JobSeeker> findByJsNameEndingWithIgnoreCaseService(String nameLastChars);

    public List<JobSeeker> findByJsNameContainingIgnoreCaseService(String chars);

    public List<JobSeeker> findByJsNameLikeIgnoreCaseService(String pattern);

    public List<JobSeeker> findByQlfyInService(List<String> qualifications);

    public List<JobSeeker> readByMobileNoIsNullService();

    public List<JobSeeker> findByQlfyInOrderByQlfyAscService(List<String> qualifications);
}
