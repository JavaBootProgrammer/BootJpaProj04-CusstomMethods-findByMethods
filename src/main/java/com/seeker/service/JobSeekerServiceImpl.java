package com.seeker.service;

import com.seeker.entity.JobSeeker;
import com.seeker.repository.IJobSeekerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerServiceImpl implements IJobSeekerService{

    @Autowired
    private IJobSeekerRepository jsRepo;

    @Override
    public List<JobSeeker> findByJsNameEqualsService(String name) {
           return jsRepo.findByJsNameEquals(name);
    }

    @Override
    public List<JobSeeker> getByJsNameIsService(String name) {
        return jsRepo.getByJsNameIs(name);
    }

    @Override
    public List<JobSeeker> readByJsNameService(String name) {
        return jsRepo.readByJsName(name);
    }

    @Override
    public List<JobSeeker> findByPercentageBetweenService(double start, double end) {
        return jsRepo.findByPercentageBetween(start, end);
    }

    @Override
    public List<JobSeeker> findByJsNameStartingWithService(String nameInitialChars) {
        return jsRepo.findByJsNameStartingWith(nameInitialChars);
    }

    @Override
    public List<JobSeeker> findByJsNameEndingWithIgnoreCaseService(String nameLastChars) {
        return jsRepo.findByJsNameEndingWithIgnoreCase(nameLastChars);
    }

    @Override
    public List<JobSeeker> findByJsNameContainingIgnoreCaseService(String chars) {
        return jsRepo.findByJsNameContainingIgnoreCase(chars);
    }

    @Override
    public List<JobSeeker> findByJsNameLikeIgnoreCaseService(String pattern) {
        return jsRepo.findByJsNameLikeIgnoreCase(pattern);
    }

    @Override
    public List<JobSeeker> findByQlfyInService(List<String> qualifications) {
        return jsRepo.findByQlfyIn(qualifications);
    }

    @Override
    public List<JobSeeker> readByMobileNoIsNullService() {
        return List.of();
    }

    @Override
    public List<JobSeeker> findByQlfyInOrderByQlfyAscService(List<String> qualifications) {
        return List.of();
    }
}
