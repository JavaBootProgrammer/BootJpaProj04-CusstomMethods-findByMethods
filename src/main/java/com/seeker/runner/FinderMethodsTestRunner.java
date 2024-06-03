package com.seeker.runner;

import java.util.List;

import com.seeker.entity.JobSeeker;
import com.seeker.service.IJobSeekerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.seeker.repository.IJobSeekerRepository;

@Component
public class FinderMethodsTestRunner implements CommandLineRunner {


	@Autowired
	private IJobSeekerService jobSeekerService;

	@Override
	public void run(String... args) throws Exception {

		List<JobSeeker> list = jobSeekerService.findByJsNameEqualsService("mahesh");
		list.forEach(System.out::println);

		jobSeekerService.readByJsNameService("mahesh").forEach(System.out::println);
		System.out.println("----------------------");
		jobSeekerService.getByJsNameIsService("mahesh").forEach(System.out::println);

		jobSeekerService.findByPercentageBetweenService(45.0, 89.0).forEach(System.out::println);

		jobSeekerService.findByJsNameStartingWithService("M").forEach(System.out::println);
		jobSeekerService.findByJsNameEndingWithIgnoreCaseService("H").forEach(System.out::println);
		jobSeekerService.findByJsNameContainingIgnoreCaseService("ah").forEach(System.out::println);

		jobSeekerService.findByJsNameLikeIgnoreCaseService("m%").forEach(System.out::println);
		System.out.println("_____________________");
		jobSeekerService.findByJsNameLikeIgnoreCaseService("%h").forEach(System.out::println);
		System.out.println("_____________________");
		jobSeekerService.findByJsNameLikeIgnoreCaseService("%sh").forEach(System.out::println);

		jobSeekerService.findByQlfyInService(List.of("B.E", "B.Sc")).forEach(System.out::println);
		jobSeekerService.readByMobileNoIsNullService().forEach(System.out::println);
		jobSeekerService.findByQlfyInOrderByQlfyAscService(List.of("B.E", "B.sc", "B.Tech")).forEach(System.out::println);

	}

}
